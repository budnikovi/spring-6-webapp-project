package com.springframework.spring6webappproject.services;

import com.springframework.spring6webappproject.domain.Book;

public interface BookService {

    Iterable<Book> findall();

}
