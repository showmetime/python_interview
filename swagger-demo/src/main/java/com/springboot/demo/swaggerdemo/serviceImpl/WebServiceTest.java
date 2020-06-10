package com.springboot.demo.swaggerdemo.serviceImpl;

import com.springboot.demo.swaggerdemo.entity.TbSeller;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * @Author: ASUS
 * @description: TODO
 * @Date: 23:31 2020/6/9
 */
public class WebServiceTest {
    public static void main(String[] args) {
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient("http://127.0.0.1:8081/soap/SellerService?wsdl");

        TbSeller[] objects = new TbSeller[0];

        try {
            objects = (TbSeller[]) client.invoke("getSellerById", "baidu");
            System.out.println("结果为********" +objects[0].toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
