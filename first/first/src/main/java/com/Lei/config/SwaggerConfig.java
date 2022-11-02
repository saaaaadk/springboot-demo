//package com.Lei.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.util.Predicates;
//import org.springframework.stereotype.Component;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import springfox.documentation.service.Contact;
//
//@Configuration
//@EnableSwagger2
//@Component
//public class SwaggerConfig {
//    @Bean
//    public Docket webApiConfig() {
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("webApi")//("webApi")是自己命名的，写abc也可以
//                .apiInfo(webApiInfo())
//                .select()
//                .paths(Predicates.negate(PathSelectors.regex("/admin/.*")))
//                .paths(Predicates.negate(PathSelectors.regex("/error.*")))
//                .build();
//
//    }
//
//    private ApiInfo webApiInfo() {
//
//        return new ApiInfoBuilder()
//                .title("网站-课程中心API文档")
//                .description("本文档描述了课程中心微服务接口定义")
//                .version("1.0")
//                .contact(new Contact("java", "https://atguigu.com", "123456@qq.com"))
//                .build();
//
//    }
//}
