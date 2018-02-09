package sudip.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sudip.springframework.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
