package simon.springframework.spring_35._webapp.services;

import org.springframework.stereotype.Service;
import simon.springframework.spring_35._webapp.domain.Author;
import simon.springframework.spring_35._webapp.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
