package com.springframework.spring6webappproject.bootstrap;

import com.springframework.spring6webappproject.domain.Author;
import com.springframework.spring6webappproject.domain.Book;
import com.springframework.spring6webappproject.domain.Publisher;
import com.springframework.spring6webappproject.repositories.AuthorRepository;
import com.springframework.spring6webappproject.repositories.BookRepository;
import com.springframework.spring6webappproject.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book somenamebook = new Book();
        somenamebook.setTitle("Domain Driven Design");
        somenamebook.setIsbn("123456");

        Publisher londonBooks = new Publisher();
        londonBooks.setPublisherName("londonBooks");
        londonBooks.setCity("London");
        londonBooks.setAddress("Turing Avenue 12");

        Author ericSaved = authorRepository.save(eric);
        Book somenamebookSaved = bookRepository.save(somenamebook);
        Publisher londonBooksSaved = publisherRepository.save(londonBooks);

        somenamebookSaved.setPublisher(londonBooksSaved);
        bookRepository.save(somenamebookSaved);

        ericSaved.getBooks().add(somenamebook);
        authorRepository.save(ericSaved);

        somenamebookSaved.getAuthors().add(ericSaved);
        bookRepository.save(somenamebookSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}
