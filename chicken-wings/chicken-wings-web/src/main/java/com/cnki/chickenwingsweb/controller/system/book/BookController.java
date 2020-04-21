package com.cnki.chickenwingsweb.controller.system.book;


import com.cnki.chickenwingsweb.dao.system.book.BookDao;
import com.cnki.chickenwingsweb.entities.Books;
import com.cnki.chickenwingsweb.entities.simple.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.Collection;

@Controller
@RequestMapping("/systembook")
public class BookController {
   @Autowired
   BookDao bookDao;
   /* @RequestMapping("/list")
    public String findCities(Model model) {
        Collection<Books> bookAll = bookDao.getBookAll();
        //放在请求域中
        model.addAttribute("bookAll",bookAll);
        return "lyear_pages_doc.html";
    }*/

   /* //查询所有员工返回列表页面
    @GetMapping("/list")
    public String list(Model model){
        Collection<Books> bookAll = bookDao.getBookAll();
        //放在请求域中
        model.addAttribute("books",bookAll);
        // thymeleaf默认就会拼串
        // classpath:/templates/xxxx.html
        return "lyear_pages_doc";
    }*/


}
