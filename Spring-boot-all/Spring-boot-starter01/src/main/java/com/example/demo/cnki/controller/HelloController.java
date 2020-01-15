package com.example.demo.cnki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@ResponseBody
@Controller*/
@RestController
public class HelloController {
    //测试 push
    @RequestMapping("/")
    public String HelloWorld(){
        return "hello world";
    }
}
