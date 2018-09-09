package com.lmsolutions.coursespring5WebApp.repositories;

import com.lmsolutions.coursespring5WebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
