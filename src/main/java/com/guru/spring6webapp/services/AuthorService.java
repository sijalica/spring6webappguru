package com.guru.spring6webapp.services;

import com.guru.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> getAuthors();
}
