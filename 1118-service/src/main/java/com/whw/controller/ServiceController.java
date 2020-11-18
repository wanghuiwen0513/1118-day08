package com.whw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:MR.W on 2020/11/18 8:53
 */
@RestController
public class ServiceController {
    @RequestMapping("/test")
    public String test(){
        return "123456";
    }
}
