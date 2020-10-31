package com.gauro.SpringFramework5Example.bootstrap;

import com.gauro.SpringFramework5Example.domain.Author;
import com.gauro.SpringFramework5Example.domain.Book;
import com.gauro.SpringFramework5Example.repositories.AuthorRepository;
import com.gauro.SpringFramework5Example.repositories.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Chandra
 */

@Slf4j
@AllArgsConstructor
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Good=====vvvv==========>");
        System.out.println("Hello------********----");
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}
