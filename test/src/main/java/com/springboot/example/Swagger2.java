package com.springboot.example;
//swagger2的配置文件，在项目的启动类的同级文件建立

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
/**
 * Created by v-zhaojy on 2018/7/12.
 */
@Configuration
@EnableSwagger2
public class Swagger2
{
        //swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
        @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    //为当前包路径
                    .apis(RequestHandlerSelectors.basePackage("com.springboot.example.Controller"))//扫描com.springboot.example.Controller路径下的api文档
                    .paths(PathSelectors.any())//路径判断
                    .build();
        }
        //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    //页面标题
                    .title("Spring Boot 测试使用 Swagger2 构建RESTful API")//标题
                    //创建人
                    .contact(new Contact("piglet", "http://www.baidu.com", ""))//作者信息
                    .termsOfServiceUrl("http://www.google.com")//（不可见）条款地址
                    //版本号
                    .version("1.0") //版本号
                    //描述
                    .description("API 描述")//描述
                    .build();
        }
}
