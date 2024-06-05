package ir.tapture.spring6webapp.services;

import ir.tapture.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
