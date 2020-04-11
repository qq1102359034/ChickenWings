package com.cnki.chickenwingsweb.dao.system.book;

import com.cnki.chickenwingsweb.entities.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BookDao {

    private static Map<Integer, Books> map = null;

    static{
        map = new HashMap<Integer, Books>();

        map.put(101, new Books(101,"2","3","4",5,"6","7"));
        map.put(102, new Books(102,"2","3","4",5,"6","7"));
        map.put(103, new Books(103,"2","3","4",5,"6","7"));
        map.put(104, new Books(104,"2","3","4",5,"6","7"));
        map.put(105, new Books(105,"2","3","4",5,"6","7"));
    }

    public Collection<Books> getBookAll(){
        return map.values();
    }

    public Books getBookById(Integer id){
        return map.get(id);
    }

}
