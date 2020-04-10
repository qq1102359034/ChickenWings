package com.cnki.chickenwingsweb.controller.system.book;


import com.cnki.chickenwingsweb.service.system.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/systembook")
public class BookController {
   /* @Autowired
    BookService bookService;*/
    @RequestMapping("/list")
    public String findCities() {

     /*   List<BookService> books = (List<BookService>) bookService.findAll();

        params.put("books", books);*/

        return "";
    }
}
