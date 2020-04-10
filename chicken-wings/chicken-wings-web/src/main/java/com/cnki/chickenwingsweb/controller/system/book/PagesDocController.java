package com.cnki.chickenwingsweb.controller.system.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pagesDoc")
public class PagesDocController {
    //文档列表
    @RequestMapping("/docTable")
    public String docTable(){
        return "lyear_pages_doc.html";
    }
    @GetMapping("/emps")
    public String bookList(){

        return "lyear_pages_doc.html";
    }

}
