package com.gauro.SpringFramework5Example.bootstrap;

import com.gauro.SpringFramework5Example.repositories.AuthorRepository;
import com.gauro.SpringFramework5Example.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;

/**
 * @author Chandra
 */

@AllArgsConstructor
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
