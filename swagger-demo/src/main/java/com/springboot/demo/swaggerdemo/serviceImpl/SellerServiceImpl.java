package com.springboot.demo.swaggerdemo.serviceImpl;

import com.springboot.demo.swaggerdemo.entity.TbSeller;
import com.springboot.demo.swaggerdemo.mapper.TbSellerMapper;
import com.springboot.demo.swaggerdemo.service.SellerService;
import com.springboot.demo.swaggerdemo.util.SpringContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @Author: ASUS
 * @description: TODO
 * @Date: 22:04 2020/6/9
 */

@WebService(serviceName = "SellerService",//对外发布的服务名
            targetNamespace = "http://service.swaggerdemo.demo.springboot.com/",
            // 指定想要的名称空间，通常使用包名反转 必须要加/
            endpointInterface = "com.springboot.demo.swaggerdemo.service.SellerService")
            //服务接口全路径, 指定做SEI（Service EndPoint Interface）服务端点接口
@Component
public class SellerServiceImpl implements SellerService {



    @Override
    public TbSeller getSellerById(String sellerId) {
        TbSellerMapper tbSellerMapper = SpringContextUtils.getBean(TbSellerMapper.class);
        return tbSellerMapper.selectByPrimaryKey(sellerId);
    }

    @Override
    public String getSellerName(String sellerId) {
        TbSellerMapper tbSellerMapper = SpringContextUtils.getBean(TbSellerMapper.class);
        return tbSellerMapper.selectNameBySellerId(sellerId);
    }
}
