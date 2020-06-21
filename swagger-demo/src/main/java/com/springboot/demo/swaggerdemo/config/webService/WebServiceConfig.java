//package com.springboot.demo.swaggerdemo.config.webService;
//
//import com.springboot.demo.swaggerdemo.service.SellerService;
//import org.apache.cxf.Bus;
//// 不是它import org.apache.cxf.endpoint.EndpointImpl;
//import org.apache.cxf.jaxws.EndpointImpl;
//import org.apache.cxf.transport.servlet.CXFServlet;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.xml.ws.Endpoint;
//
///**
// * @Author: ASUS
// * @description: TODO
// * @Date: 22:16 2020/6/9
// */
//@Configuration
//public class WebServiceConfig {
//    @Autowired
//    private Bus bus;
//
//    @Autowired
//    private SellerService sellerService;
//
//    /**
//     * 此方法作用是改变项目中服务名的前缀名，此处127.0.0.1或者localhost不能访问时，请使用ipconfig查看本机ip来访问
//     * 此方法被注释后:wsdl访问地址为http://127.0.0.1:8080/services/SellerService?wsdl
//     * 去掉注释后：wsdl访问地址为：http://127.0.0.1:8080/soap/SellerService?wsdl
//     * @return
//     */
//    @SuppressWarnings("all")
//    @Bean
//    public ServletRegistrationBean dispatcherServlet() {
//        return new ServletRegistrationBean(new CXFServlet(), "/soap/*");
//    }
//
//    /**
//     * @Description: webservice发布导致其它接口访问不到 需要手动配置ServletRegistrationBean
//     * @Author: ASUS
//     * @Date: 2020/6/12 22:17
//     * @Params: TODO 他妈的 还有一种就是将endpoint进行xml配置 javashop也是这种
//    * @Return:
//     */
//    @Bean
//    public ServletRegistrationBean resetServlet(){
//        // 注解扫描上下文
//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        // 项目包名
//        applicationContext.scan("com.springboot.demo.swaggerdemo.controller");
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(dispatcherServlet);
//        registrationBean.setLoadOnStartup(1);
//        registrationBean.addUrlMappings("/*");
//        return registrationBean;
//    }
//
//
//    /** JAX-WS
//     * 站点服务
//     * **/
//    @Bean
//    public Endpoint endpoint() {
//        EndpointImpl endpoint = new EndpointImpl(bus, sellerService);
//        endpoint.publish("/SellerService");
//        // 注意 这个他妈的要要一样和接口的名字
//        return endpoint;
//    }
//
//}
