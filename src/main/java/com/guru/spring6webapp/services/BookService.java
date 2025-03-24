package com.guru.spring6webapp.services;

import com.guru.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> getBooks();
}
