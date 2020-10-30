package com.lin.mp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: linhong
 * @Date: 2020/10/30 09:39
 * @Description: 简简单单springboot
 */
@RestController
public class TestController {


    @PostMapping("/test")
    public String test(){
        return ("hello,mp");
    }
}
