package simon.springframework.spring_35._webapp.services;

import simon.springframework.spring_35._webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
