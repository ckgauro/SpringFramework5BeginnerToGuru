package com.gauro.SpringFramework5Example.repositories;

import com.gauro.SpringFramework5Example.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Chandra
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
