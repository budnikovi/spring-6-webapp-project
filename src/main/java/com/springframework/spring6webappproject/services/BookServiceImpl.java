package com.springframework.spring6webappproject.services;

import com.springframework.spring6webappproject.domain.Book;
import com.springframework.spring6webappproject.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findall() {
        return bookRepository.findAll();
    }
}
