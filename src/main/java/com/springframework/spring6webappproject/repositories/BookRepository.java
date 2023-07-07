package com.springframework.spring6webappproject.repositories;

import com.springframework.spring6webappproject.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
