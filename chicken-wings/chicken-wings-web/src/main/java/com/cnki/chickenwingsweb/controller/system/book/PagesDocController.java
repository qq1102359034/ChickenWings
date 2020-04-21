package com.cnki.chickenwingsweb.controller.system.book;

import com.cnki.chickenwingsweb.dao.system.book.BookDao;
import com.cnki.chickenwingsweb.entities.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Map;

@Controller
@RequestMapping("/pagesDoc")
public class PagesDocController {

    @Autowired
    BookDao bookDao;

    //查询所有员工返回列表页面
    @GetMapping("/docTable")
    public String list(Model model){
        Collection<Books> bookAll = bookDao.getBookAll();
        //放在请求域中
        model.addAttribute("books",bookAll);
        // thymeleaf默认就会拼串
        // classpath:/templates/xxxx.html
        return "lyear_pages_doc";
    }


    @GetMapping("/addBook")
    public String addBookPage(Model model){
        Collection<Books> bookAll = bookDao.getBookAll();
        //放在请求域中
        model.addAttribute("books",bookAll);
        return "lyear_pages_add_doc.html";
    }
    @PostMapping("/addBook")
    public String addBook(HttpServletRequest request){
        //type title
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String s : parameterMap.keySet()) {
            System.out.println("保存员工信息:"+s+" 内容:"+request.getParameter(s));
        }

        //bookDao.save();
        return "redirect:/pagesDoc/docTable";
    }
}
