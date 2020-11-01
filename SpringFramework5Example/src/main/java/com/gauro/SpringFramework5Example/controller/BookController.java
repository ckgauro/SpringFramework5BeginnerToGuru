package com.gauro.SpringFramework5Example.controller;

import com.gauro.SpringFramework5Example.domain.Book;
import com.gauro.SpringFramework5Example.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.StreamSupport;

/**
 * @author Chandra
 */

@Slf4j
@Controller
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        log.info("Books is called====>");
        model.addAttribute("books", bookRepository.findAll());
        Iterable<Book> lsBook = bookRepository.findAll();
        StreamSupport.stream(lsBook.spliterator(), false).forEach(e -> log.info(e.toString()));
        log.info("Books is ****====>");
        return "books/list";
    }
}
