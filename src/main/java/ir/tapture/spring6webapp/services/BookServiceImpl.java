package ir.tapture.spring6webapp.services;

import ir.tapture.spring6webapp.domain.Book;
import ir.tapture.spring6webapp.repositories.BookRepository;

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
