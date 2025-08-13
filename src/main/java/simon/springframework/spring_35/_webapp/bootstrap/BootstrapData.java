package simon.springframework.spring_35._webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import simon.springframework.spring_35._webapp.domain.Author;
import simon.springframework.spring_35._webapp.domain.Book;
import simon.springframework.spring_35._webapp.domain.Publisher;
import simon.springframework.spring_35._webapp.repositories.AuthorRepository;
import simon.springframework.spring_35._webapp.repositories.BookRepository;
import simon.springframework.spring_35._webapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("How to create Springboot");
        ddd.setIsbn("236826489");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE without development EJB");
        noEJB.setIsbn("23436087");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Josh Makarosh");
        publisher.setAddress("Juzne mesto");
        publisherRepository.save(publisher);

        System.out.println("Publisher count: " + publisherRepository.count());
    }
}
