package com.lmsolutions.coursespring5WebApp.repositories;

import com.lmsolutions.coursespring5WebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Book repository interface with JPA
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
