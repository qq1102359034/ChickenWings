package com.cnki.chickenwingsweb.controller.simple;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/simple")
public class LoginSimpleController {

//    @DeleteMapping
//    @PutMapping
//    @GetMapping
    @RequestMapping("/login")
    public String logins(){
        return  "simple/login";
    }

    //@RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username) && "123".equals(password)){
            //登陆成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("loginUser",username);
            return "redirect:/emps";
        }else{
            //登陆失败
            map.put("msg","用户名密码错误");
            return  "simple/success.html";
        }

    }
}
