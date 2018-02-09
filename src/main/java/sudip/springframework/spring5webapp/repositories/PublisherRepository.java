package sudip.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sudip.springframework.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}
