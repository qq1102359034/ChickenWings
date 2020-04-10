package com.cnki.chickenwingsweb.service.system.book.impl;

import com.cnki.chickenwingsweb.entities.Books;
import com.cnki.chickenwingsweb.entities.Books;
import com.cnki.chickenwingsweb.repository.system.book.BookRepository;
import com.cnki.chickenwingsweb.service.system.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookServiceImpl implements BookService {
        @Autowired
        private BookRepository repository;
        public List<Books> findAll(){
                List<Books> books = (List<Books>) repository.findAll();
                return books;
        }
}
