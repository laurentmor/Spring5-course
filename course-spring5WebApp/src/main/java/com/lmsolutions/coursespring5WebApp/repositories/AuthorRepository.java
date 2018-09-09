package com.lmsolutions.coursespring5WebApp.repositories;

import com.lmsolutions.coursespring5WebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
