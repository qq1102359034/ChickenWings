package com.cnki.chickenwingsweb.controller.table;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/table")
public class FormsController {
    @RequestMapping("/formElements")
    public String formsElements(){
        return "lyear_forms_elements.html";
    }
}
