package com.guru.spring6webapp.repositories;

import com.guru.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
