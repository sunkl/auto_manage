package com.auto.auto_manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author sunkl
 * @name TestController
 * @desc TODO
 * @date 2020/1/15
 * @since v1.0.2
 */
@Controller
public class TestController {
    @RequestMapping(method = RequestMethod.GET,value = "/index")
    public String index(){
        System.out.println("123");
        System.out.println("456");


        return "/index";
    }

}
