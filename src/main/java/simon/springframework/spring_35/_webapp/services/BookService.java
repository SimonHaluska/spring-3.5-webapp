package simon.springframework.spring_35._webapp.services;

import simon.springframework.spring_35._webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
