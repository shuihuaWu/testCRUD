package com.wsh.testCRUD.controller;

import com.wsh.testCRUD.model.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wushuihua on 2017/10/10.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String say(){
        return "Hello Java World!";
    }
/*
    @Value("${name}")
    private String name;

    @RequestMapping(value = "/say/name",method = RequestMethod.GET)
    public String sayName(){
        return name;
    }
 */

    @Autowired
    private PersonProperties personProperties;

    @RequestMapping(value = "/say/name/age",method = RequestMethod.GET)
    public String sayNameAndAge(){
        return personProperties.getName()+personProperties.getAge();
    }
}
