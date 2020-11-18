package com.whw.service;

/**
 * @author:MR.W on 2020/11/18 8:56
 */

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
    @RequestMapping("/test")
    public String test(){
        return "123456";
    }
}
