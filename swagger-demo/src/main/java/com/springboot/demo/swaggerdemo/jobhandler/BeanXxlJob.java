//package com.springboot.demo.swaggerdemo.jobhandler;
//
//import com.xxl.job.admin.core.model.XxlJobLog;
//import com.xxl.job.core.biz.model.ReturnT;
//import com.xxl.job.core.handler.annotation.XxlJob;
//import com.xxl.job.core.log.XxlJobLogger;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * @Author: ASUS
// * @description: 自己写的bean模式测试
// * @Date: 14:47 2020/6/6
// */
//@Slf4j
//@Component
//public class BeanXxlJob {
//    // 对着官方示例开始写
//    @XxlJob(value = "BeanJobHander")
//    public ReturnT<String> beanJobHandler(String param){
//        Date currentDate = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
//        String format = sdf.format(currentDate);
//        XxlJobLogger.log("没过1分钟执行一次：" + format);
//        return ReturnT.SUCCESS;
//    }
//
//    public void initTest(){
//        System.out.println("开始自定的初始化了");
//    }
//
//    public void destroyTest(){
//        System.out.println("自定义的结束");
//    }
//}
