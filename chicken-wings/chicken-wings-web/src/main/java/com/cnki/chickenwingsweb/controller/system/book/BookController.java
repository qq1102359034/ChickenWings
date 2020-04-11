package com.cnki.chickenwingsweb.controller.system.book;


import com.cnki.chickenwingsweb.dao.system.book.BookDao;
import com.cnki.chickenwingsweb.entities.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/systembook")
public class BookController {
   @Autowired
   BookDao bookDao;
    @RequestMapping("/list")
    public String findCities(Model model) {
        Collection<Books> bookAll = bookDao.getBookAll();

        //放在请求域中
        model.addAttribute("bookAll",bookAll);
        return "lyear_pages_doc.html";
    }
}
