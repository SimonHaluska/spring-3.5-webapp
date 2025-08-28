package simon.springframework.spring_35._webapp.services;

import org.springframework.stereotype.Service;
import simon.springframework.spring_35._webapp.domain.Book;
import simon.springframework.spring_35._webapp.repositories.BookRepository;

@Service
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
