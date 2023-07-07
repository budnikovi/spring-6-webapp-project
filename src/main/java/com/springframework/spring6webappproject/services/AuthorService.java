package com.springframework.spring6webappproject.services;

import com.springframework.spring6webappproject.domain.Author;

public interface AuthorService {
    Iterable<Author> findall();
}
