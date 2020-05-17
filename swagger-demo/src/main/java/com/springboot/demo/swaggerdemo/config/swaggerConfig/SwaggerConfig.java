package com.springboot.demo.swaggerdemo.config.swaggerConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2//这个可能要
@Configuration
//@EnableWebMvc 不能要他 否则直接报错 导致enableAutoconfig失效
//@ComponentScan(basePackages = "com.springboot.demo.swaggerdemo.controller")
// 这个也不需 启动类会自动扫描后面所在的包
public class SwaggerConfig {
    // 这里必须指明所对应的controller层
    private static final String SWAGGER_SCAN_BASE_PACKAGE =
            "com.springboot.demo.swaggerdemo.controller";
    // 接口版本号
    private final String version = "1.0";
    // 接口大标题
    private final String title = "springboot集成swagger、mybatis工程";
    // 具体的描述
    private final String desciption = "API文档自动生成示例";
    // 服务说明url
    private final String termOfServiceUrl = "http://www.kingeid.com";
    // licence
    private final String licence = "MIT";
    // licence url
    private final String licenceUrl = "https://mit-license.org/";
    // 接口作者的联系方式
    private final Contact contact = new Contact("张三",
            "qw282224595@hotmail.com","github.com/showmetime/python_interview");
    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2).
                apiInfo(buildApiInf())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any()) // 可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .build();
    }


    private ApiInfo buildApiInf() {
        return  new ApiInfoBuilder().title(title)
                .description(desciption)
                .termsOfServiceUrl(termOfServiceUrl)
                .version(version)
                .license(licence)
                .licenseUrl(licenceUrl)
                .contact(contact).build();
    }

}
