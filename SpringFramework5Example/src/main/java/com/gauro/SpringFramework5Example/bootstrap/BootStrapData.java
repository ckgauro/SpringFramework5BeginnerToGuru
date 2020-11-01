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
        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        Book spring = new Book("Spring", "123123");
        rod.getBooks().add(spring);
        spring.getAuthors().add(rod);
        spring.setPublisher(publisher);
        publisher.getBooks().add(spring);

        bookRepository.save(spring);

        log.info("New Book===>");
       // rod.getBooks().forEach(el->log.info(el.toString()));

        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
        //log.info(iBooks.spliterator());
        //iBooks.forEach(el->log.info(el.toString()));
        Iterable<Book> lsUser = bookRepository.findAll();
        StreamSupport.stream(lsUser.spliterator(), false).forEach(System.out::println);

           }
}
