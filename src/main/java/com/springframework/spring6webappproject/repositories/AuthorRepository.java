package com.springframework.spring6webappproject.repositories;

import com.springframework.spring6webappproject.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
