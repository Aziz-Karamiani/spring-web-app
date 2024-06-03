package ir.tapture.spring6webapp.repositories;

import ir.tapture.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
