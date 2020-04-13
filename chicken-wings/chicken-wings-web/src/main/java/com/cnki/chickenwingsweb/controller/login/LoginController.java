package com.cnki.chickenwingsweb.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @RequestMapping(value = "/")
    public String logins() {
        return "lyear_pages_login";//lyear_pages_login.html
    }
    @RequestMapping(value = "/login")
    public String login() {
        return "lyear_pages_login";//lyear_pages_login.html
    }

    /*
    @DeleteMapping
    @PutMapping
    @GetMapping */
    //@RequestMapping("/in")
    // @RequestMapping(value="/in",method = RequestMethod.POST)
    @PostMapping(value = "/user/login/in")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> mapError, HttpSession session) {  //@PathVariable("username") String username
        if (!StringUtils.isEmpty(username) && "123".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/index.html";
        } else {
            mapError.put("msg", "密码输入错误!");
            return "lyear_pages_login";
        }
    }


    @RequestMapping("login/out")
    public String logout(HttpSession session) {
        session.setAttribute("loginUser", null);
        return "lyear_pages_login";
    }


}
