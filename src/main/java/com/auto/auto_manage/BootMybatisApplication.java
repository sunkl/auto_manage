package com.auto.auto_manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sunkl
 * @name BootMybatisApplication
 * @desc TODO
 * @date 2020/1/15
 * @since v1.0.2
 */
@MapperScan("com.auto.auto_manage.mapping")
@Controller
@SpringBootApplication
public class BootMybatisApplication  {
    @RequestMapping(value="hello")
    @ResponseBody
    public String hello(){
        return "hello spring boot";
    }
}
