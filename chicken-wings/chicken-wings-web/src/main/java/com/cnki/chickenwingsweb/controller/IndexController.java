package com.cnki.chickenwingsweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("")
    public String index(){
        //classpath:/templates/index.html
        return "index";
    }
    @RequestMapping("/")
    public String start(){
        //classpath:/templates/index.html
        return "index";
    }

    /**
     * thymeleaf模板引擎默认规则
     *     private static final Charset DEFAULT_ENCODING;
     *     public static final String DEFAULT_PREFIX = "classpath:/templates/";
     *     public static final String DEFAULT_SUFFIX = ".html";
     *     private boolean checkTemplate = true;
     *     private boolean checkTemplateLocation = true;
     *     private String prefix = "classpath:/templates/";
     *     private String suffix = ".html";
     *
     *
     *     html需要加入在html标签xmlns:th="http://www.thymeleaf.org"   <html lang="en" xmlns:th="http://www.thymeleaf.org">
     *     th:text 获取文本转义特殊字符
     *     th:utext 获取文本不转义特殊字符
     *
     */

    @RequestMapping("/indextest")
    public String indextest(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("user", Arrays.asList("a","b","c"));

        //classpath:/public/indextest.html
        return "indextest";
    }
}
