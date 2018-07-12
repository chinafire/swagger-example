package com.springboot.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by v-zhaojy on 2018/7/12.
 */

@SpringBootApplication
public class SpringbootTestApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringbootTestApplication.class).web(true).run(args);    }
}
