package com.springboot.example.model;

/**
 * Created by v-zhaojy on 2018/7/12.
 */
import io.swagger.annotations.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "User得实体，----》",reference = "我是参考")
public class User {

    @ApiParam(value = "姓名--------------",required = true)
    private String name;
    //在swagger-ui.html#页面中如果返回User，ModelModel Schema选项卡可见
    @ApiModelProperty(value = "id",dataType = "String")
    private String id;
    //在http://localhost:8080/v2/api-docs最后一行的实体可见
    @ApiModelProperty(value = "年龄----------",required = true)
    private Integer age;

}