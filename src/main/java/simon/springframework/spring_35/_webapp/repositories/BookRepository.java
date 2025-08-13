package simon.springframework.spring_35._webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import simon.springframework.spring_35._webapp.domain.Book;

public interface BookRepository extends CrudRepository <Book, Long> {
}
