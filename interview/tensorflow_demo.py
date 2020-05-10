# -*- coding: utf-8 -*-
"""
GoogleNet也被称为InceptionNet
Created on Mon Feb 10 12:15:35 2020
@author: 月光下的云海
"""


import tensorflow as tf
from keras.datasets import cifar10
import numpy as np
import tensorflow.contrib.slim as slim
import warnings

warnings.filterwarnings("ignore")# 将警告过滤掉

tf.reset_default_graph()

tf.reset_default_graph()
(x_train,y_train),(x_test,y_test) = cifar10.load_data()
x_train = x_train.astype('float32')
x_test = x_test.astype('float32')
y_train = y_train.astype('int32')
y_test = y_test.astype('int32')
y_train = y_train.reshape(y_train.shape[0])
y_test = y_test.reshape(y_test.shape[0])
x_train = x_train/255
x_test = x_test/255


#************************************************ 构建inception ************************************************
#构建一个多分支的网络结构
#INPUTS:
#   d0_1:最左边的分支，分支0，大小为1*1的卷积核个数
#   d1_1:左数第二个分支，分支1，大小为1*1的卷积核的个数
#   d1_3:左数第二个分支，分支1，大小为3*3的卷积核的个数
#   d2_1:左数第三个分支，分支2，大小为1*1的卷积核的个数
#   d2_5:左数第三个分支，分支2，大小为5*5的卷积核的个数
#   d3_1:左数第四个分支，分支3，大小为1*1的卷积核的个数
#   scope:参数域名称
#   reuse:是否重复使用
#***************************************************************************************************************
def inception(x,d0_1,d1_1,d1_3,d2_1,d2_5,d3_1,scope = 'inception',reuse = None):
    with tf.variable_scope(scope,reuse = reuse):
        #slim.conv2d,slim.max_pool2d的默认参数都放在了slim的参数域里面
        with slim.arg_scope([slim.conv2d,slim.max_pool2d],stride = 1,padding = 'SAME'):
            #第一个分支
            with tf.variable_scope('branch0'):
                branch_0 = slim.conv2d(x,d0_1,[1,1],scope = 'conv_1x1')
            #第二个分支
            with tf.variable_scope('branch1'):
                branch_1 = slim.conv2d(x,d1_1,[1,1],scope = 'conv_1x1')
                branch_1 = slim.conv2d(branch_1,d1_3,[3,3],scope = 'conv_3x3')
            #第三个分支
            with tf.variable_scope('branch2'):
                branch_2 = slim.conv2d(x,d2_1,[1,1],scope = 'conv_1x1')
                branch_2 = slim.conv2d(branch_2,d2_5,[5,5],scope = 'conv_5x5')
            #第四个分支
            with tf.variable_scope('branch3'):
                branch_3 = slim.max_pool2d(x,[3,3],scope = 'max_pool')
                branch_3 = slim.conv2d(branch_3,d3_1,[1,1],scope = 'conv_1x1')
            #连接
            net = tf.concat([branch_0,branch_1,branch_2,branch_3],axis = -1)
            return net


#*************************************** 使用inception构建GoogleNet *********************************************
#使用inception构建GoogleNet
#INPUTS:
#   inputs-----------输入
#   num_classes------输出类别数目
#   is_trainning-----batch_norm层是否使用训练模式，batch_norm和is_trainning密切相关
#                    当is_trainning = True 时候,它使用一个batch数据的平均移动,方差值
#                    当is_trainning = Flase时候,它就使用固定的值
#   verbos-----------控制打印信息
#   reuse------------是否重复使用
#***************************************************************************************************************
def googlenet(inputs,num_classes,reuse = None,is_trainning = None,verbose = False):
    with slim.arg_scope([slim.batch_norm],is_training = is_trainning):
        with slim.arg_scope([slim.conv2d,slim.max_pool2d,slim.avg_pool2d],
                            padding = 'SAME',stride = 1):
            net = inputs
            #googlnet的第一个块
            with tf.variable_scope('block1',reuse = reuse):
                net = slim.conv2d(net,64,[5,5],stride = 2,scope = 'conv_5x5')
                if verbose:
                    print('block1 output:{}'.format(net.shape))
            #googlenet的第二个块
            with tf.variable_scope('block2',reuse = reuse):
                net = slim.conv2d(net,64,[1,1],scope = 'conv_1x1')
                net = slim.conv2d(net,192,[3,3],scope = 'conv_3x3')
                net = slim.max_pool2d(net,[3,3],stride = 2,scope = 'max_pool')
                if verbose:
                    print('block2 output:{}'.format(net.shape))
            #googlenet第三个块
            with tf.variable_scope('block3',reuse = reuse):
                net = inception(net,64,96,128,16,32,32,scope = 'inception_1')
                net = inception(net,128,128,192,32,96,64,scope = 'inception_2')
                net = slim.max_pool2d(net,[3,3],stride = 2,scope = 'max_pool')
                if verbose:
                    print('block3 output:{}'.format(net.shape))
            #googlenet第四个块
            with tf.variable_scope('block4',reuse = reuse):
                net = inception(net,192,96,208,16,48,64,scope = 'inception_1')
                net = inception(net,160,112,224,24,64,64,scope = 'inception_2')
                net = inception(net,128,128,256,24,64,64,scope = 'inception_3')
                net = inception(net,112,144,288,24,64,64,scope = 'inception_4')
                net = inception(net,256,160,320,32,128,128,scope = 'inception_5')
                net = slim.max_pool2d(net,[3,3],stride = 2,scope = 'max_pool')
                if verbose:
                    print('block4 output:{}'.format(net.shape))
            #googlenet第五个块
            with tf.variable_scope('block5',reuse = reuse):
                net = inception(net,256,160,320,32,128,128,scope = 'inception1')
                net = inception(net,384,182,384,48,128,128,scope = 'inception2')
                net = slim.avg_pool2d(net,[2,2],stride = 2,scope = 'avg_pool')
                if verbose:
                    print('block5 output:{}'.format(net.shape))
            #最后一块
            with tf.variable_scope('classification',reuse = reuse):
                net = slim.flatten(net)
                net = slim.fully_connected(net,num_classes,activation_fn = None,normalizer_fn = None,scope = 'logit')
                if verbose:
                    print('classification output:{}'.format(net.shape))
            return net

#给卷积层设置默认的激活函数和batch_norm
with slim.arg_scope([slim.conv2d],activation_fn = tf.nn.relu,normalizer_fn = slim.batch_norm) as sc:
    conv_scope = sc
    is_trainning_ph = tf.placeholder(tf.bool,name = 'is_trainning')

    #定义占位符
    x_train_ph = tf.placeholder(shape = (None,x_train.shape[1],x_train.shape[2],x_train.shape[3]),dtype = tf.float32)
    x_test_ph = tf.placeholder(shape = (None,x_test.shape[1],x_test.shape[2],x_test.shape[3]),dtype = tf.float32)
    y_train_ph = tf.placeholder(shape = (None,),dtype = tf.int32)
    y_test_ph = tf.placeholder(shape = (None,),dtype = tf.int32)

    #实例化网络
    with slim.arg_scope(conv_scope):
        train_out = googlenet(x_train_ph,10,is_trainning = is_trainning_ph,verbose = True)
        val_out = googlenet(x_test_ph,10,is_trainning = is_trainning_ph,reuse = True)

#定义loss和acc
with tf.variable_scope('loss'):
    train_loss = tf.losses.sparse_softmax_cross_entropy(labels = y_train_ph,logits = train_out,scope = 'train')
    val_loss = tf.losses.sparse_softmax_cross_entropy(labels = y_test_ph,logits = val_out,scope = 'val')
with tf.name_scope('accurcay'):
    train_acc = tf.reduce_mean(tf.cast(tf.equal(tf.argmax(train_out,axis = -1,output_type = tf.int32),y_train_ph),tf.float32))
    val_acc = tf.reduce_mean(tf.cast(tf.equal(tf.argmax(val_out,axis = -1,output_type = tf.int32),y_test_ph),tf.float32))

#定义训练op
lr = 1e-2
opt = tf.train.MomentumOptimizer(lr,momentum = 0.9)
#通过tf.get_collection获得所有需要更新的op
update_op = tf.get_collection(tf.GraphKeys.UPDATE_OPS)
#使用tesorflow控制流,先执行update_op再进行loss最小化
with tf.control_dependencies(update_op):
    train_op = opt.minimize(train_loss)

#开启会话
sess = tf.Session()
saver = tf.train.Saver()
sess.run(tf.global_variables_initializer())

batch_size = 64

#开始训练
for e in range(10000):

    batch1 = np.random.randint(0,50000,size = batch_size)
    t_x_train = x_train[batch1][:][:][:]
    t_y_train = y_train[batch1]

    batch2 = np.random.randint(0,10000,size = batch_size)
    t_x_test = x_test[batch2][:][:][:]
    t_y_test = y_test[batch2]

    sess.run(train_op,feed_dict = {x_train_ph:t_x_train,
                                   is_trainning_ph:True,
                                   y_train_ph:t_y_train})

#    if(e%1000 == 999):
#        loss_train,acc_train = sess.run([train_loss,train_acc],
#                                        feed_dict = {x_train_ph:t_x_train,
#                                                     is_trainning_ph:True,
#                                                     y_train_ph:t_y_train})
#        loss_test,acc_test = sess.run([val_loss,val_acc],
#                                      feed_dict = {x_test_ph:t_x_test,
#                                                   is_trainning_ph:False,
#                                                   y_test_ph:t_y_test})
#        print('STEP{}:train_loss:{:.6f} train_acc:{:.6f} test_loss:{:.6f} test_acc:{:.6f}'
#             .format(e+1,loss_train,acc_train,loss_test,acc_test))

saver.save(sess = sess,save_path = 'VGGModel\model.ckpt')
print('Train Done!!')
print('--'*60)
sess.close()