from typing import  List

class Solution:
    '''
    树状数组 从后往前扫描 边统计边往数组里面添加
    元素，因为涉及大小关系 所以要排序 并且给出排名
    这一步叫做离散化
    这个树状数组就是通过二叉树演变而来的
    c[i] = a[i-2^k+1]+a[i-2^k+2]+...+a[i]
    k就是取出i的最低位1
    '''
    def reverPairs(self,nums):
        class FenwickTree:
            def __int__(self,n):
                self.size=n
                #size等于去重之后的列表的个数
                self.tree = [0 for i in range(n+1)]
                #这个树是一个列表
            def __lowbit(self,index):
                return  index & (-index)
            # 不是绝对值啊  就是为了去除index的最低位1

            def update(self,index,delta):#rank 1
                #index是要更新的位置 ，delta是更新之后的数
                while index<=self.size:
                    self.tree[index] +=delta
                    index += self.__lowbit(index)
                    #如果是3 它与-3与是1 由树状数组可知是c[4] = a[3]+[a[4]
                    #所以要改c[4],c[8] tree相当与c[i]

            def getsum(self,index):
                #这个是自己加的 一般树状数组可以求这个 就是下面的求和
                #这个有点叼 其实都是index -=__lowbit(index)
                sum_data = 0
                while(index):
                    #这里while 是判断index>0就行了
                    #从最上面开始 往下来
                    sum_data += self.tree[index]
                    index -=self.__lowbit(index)
                return  sum_data


            def query(self,index):
                #区间查询 从上到下 最少到1 可以取等
                res = 0
                while index > 0:
                    res +=self.tree[index]
                    index  -=self.__lowbit(index)

        #特判
        size = len(nums)
        if(size<2):
            return  0

        #原始数组中去除重复以后从小到大排序 这一步叫作离散化
        s = list(set(nums))

        #构建最小堆 因为从小到大一个个拿出来 用堆比较合适
        import heapq
        heapq.heapify(s)
        #将列表s转化为堆结构 第一个是最小值 第二个是最大值 它是二叉树

        #由数字查排名
        rank_map = {}
        rank = 1
        #不重复的数字的个数
        rank_map_size = len(s)
        for i in range(rank_map_size):
            num = heapq.heappop(s)
            #heappop是从堆弹出最小值
            rank_map[num] = rank
            #将每个值为key 排序rank为值 这里是将最小的排在第一个
            rank += 1
        res = 0
        #从树状数组只要不重复数字个数这么多空间就够了
        ft = FenwickTree(rank_map_size)

        # 从后向前看 拿出一个数组来 就更新一下 然后向前查询比它小的个数
        for i in range(size-1,-1,1):
            '''
            注意:为什么这里要从右往左遍历?
            一、更新最后一个，最后的右边是没有的，所以小于最后一个减一的和肯定为0
            二、接着更新第二个，它还是和小于它的进行比较，如果它右边的数大于它，那么
            小于它的树状索引为0，否则就是和它右边的进行比较了
            很巧妙 想尼玛老半天 
            '''
            rank = rank_map[nums[i]]#数组在这个位置是第几小rank
            ft.update(rank,1)#这三个是一组 对rank及包含这个节点的位置都加上1
            #这个是最小的就是1 rank比1大就是1 这里是反复的更新
            res += ft.query(rank -1)#接着查询比rank还小的个数
            '''
            主要是这里并不要全部加完之后再重新遍历相加，
            可以通过这三步累加来得到这个逆序对 其实是一样的 
            '''
        return  res




