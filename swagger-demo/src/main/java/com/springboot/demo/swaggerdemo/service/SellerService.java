//package com.springboot.demo.swaggerdemo.service;
//
//
//import com.springboot.demo.swaggerdemo.entity.TbSeller;
//
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebResult;
//import javax.jws.WebService;
//
//@WebService(serviceName = "SellerService",
//        targetNamespace = "http://service.swaggerdemo.demo.springboot.com",
//        endpointInterface = "com.springboot.demo.swaggerdemo.service.SellerService")
//        // 为什么我的不行 草泥马 这里不能 写
//public interface SellerService {
//
//    @WebMethod
//    public TbSeller getSellerById(@WebParam(name = "sellerId") String sellerId);
//
//    @WebMethod
//    @WebResult(name = "String",targetNamespace = "")
//    public String getSellerName(@WebParam(name = "sellerId") String sellerId);
//}
