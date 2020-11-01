package com.gauro.SpringFramework5Example.repositories;

import com.gauro.SpringFramework5Example.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Chandra
 */
public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
