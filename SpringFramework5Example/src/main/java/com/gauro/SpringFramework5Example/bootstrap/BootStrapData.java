package com.gauro.SpringFramework5Example.bootstrap;

import com.gauro.SpringFramework5Example.domain.Author;
import com.gauro.SpringFramework5Example.domain.Book;
import com.gauro.SpringFramework5Example.domain.Publisher;
import com.gauro.SpringFramework5Example.repositories.AuthorRepository;
import com.gauro.SpringFramework5Example.repositories.BookRepository;
import com.gauro.SpringFramework5Example.repositories.PublisherRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.StreamHandler;
import java.util.stream.StreamSupport;

/**
 * @author Chandra
 */


@Slf4j
@AllArgsConstructor
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;


    @Override
    public void run(String... args) throws Exception {
         log.info("Started in Bootstrap===>");
        // log.info("Hello------********----");
        Publisher publisher=new Publisher();
        publisher.setName("SFG publishing");
        publisher.setCity("Boston");
        publisher.setState("MA");

        publisherRepository.save(publisher);
        log.info("Publisher Count:");
        log.info(publisherRepository.count()+"");
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);

        //publisher.getBooks().add(noEJB);
        log.info(noEJB.toString());
        Book spring = new Book(23L, "Spring", "34522");
        log.info(spring.toString());
        rod.getBooks().add(spring);
       // publisher.getBooks().add(spring);
        noEJB.getAuthors().add(rod);
        log.info("========>>>>");
        log.info(rod.toString());
        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);
        log.info("-------");
       // StreamSupport.stream(bookRepository.findAll().spliterator(), false).forEach(e->log.info(e.toString()));

        //bookRepository.findAll().forEach(el -> log.info(el.toString()));

        log.info("Started in Bootstrap");
        log.info("Number of Books: " + bookRepository.count());
        log.info("Number of Authors:" + authorRepository.count());
        log.info("Number of Publisher:"+publisherRepository.count());
        Iterable<Book> iBooks=bookRepository.findAll();
        //log.info(iBooks.spliterator());
        //iBooks.forEach(el->log.info(el.toString()));
        //Iterable<Book> lsUser = bookRepository.findAll();
      //  StreamSupport.stream(lsUser.spliterator(), false).forEach(System.out::println);
    }
}
