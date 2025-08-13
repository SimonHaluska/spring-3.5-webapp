package simon.springframework.spring_35._webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import simon.springframework.spring_35._webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
