package com.cnki.chickenwingsweb.repository.system.book;

import com.cnki.chickenwingsweb.entities.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Books, Long> {

}