package com.springframework.spring6webappproject.services;

import com.springframework.spring6webappproject.domain.Author;
import com.springframework.spring6webappproject.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findall() {
        return authorRepository.findAll();
    }
}
