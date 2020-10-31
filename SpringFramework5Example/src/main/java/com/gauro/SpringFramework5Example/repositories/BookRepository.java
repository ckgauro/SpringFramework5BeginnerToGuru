package com.gauro.SpringFramework5Example.repositories;

import com.gauro.SpringFramework5Example.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Chandra
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
