package simon.springframework.spring_35._webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import simon.springframework.spring_35._webapp.domain.Author;

public interface AuthorRepository extends CrudRepository <Author, Long> {
}
