package com.springframework.spring6webappproject.repositories;

import com.springframework.spring6webappproject.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
