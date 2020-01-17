package com.cnki.chickenwingsweb.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class loginController {

    @RequestMapping("/in")
    public String login(){
        return "lyear_pages_login.html";
    }


    @RequestMapping("/out")
    public String logout(){
        return "lyear_pages_login.html";
    }
}
