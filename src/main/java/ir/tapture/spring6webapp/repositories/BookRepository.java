package ir.tapture.spring6webapp.repositories;

import ir.tapture.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
