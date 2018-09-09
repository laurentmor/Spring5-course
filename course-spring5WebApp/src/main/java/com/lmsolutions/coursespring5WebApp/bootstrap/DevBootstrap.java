package com.lmsolutions.coursespring5WebApp.bootstrap;

import com.lmsolutions.coursespring5WebApp.model.Author;
import com.lmsolutions.coursespring5WebApp.model.Book;
import com.lmsolutions.coursespring5WebApp.model.Publisher;
import com.lmsolutions.coursespring5WebApp.repositories.AuthorRepository;
import com.lmsolutions.coursespring5WebApp.repositories.BookRepository;
import com.lmsolutions.coursespring5WebApp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        intData();
    }

    private void intData() {
         String ANSI_YELLOW = "\u001B[33m";
        Logger.getAnonymousLogger().info(ANSI_YELLOW+"\n" +
                " " +
                "|\\/\\/\\/|  \n" +
                " |      |  \n" +
                " |      |  \n" +
                " | (o)(o)  \n" +
                " C      _) \n" +
                "  | ,___|  \n" +
                "  |   /    \n" +
                " /____\\    \n" +
                "/      \\");
        Author author = new Author("Laurent", "Morissette");
        Publisher publisher = new Publisher("XYZ", "1, Du commerce");
        publisherRepository.save(publisher);
        Book book = new Book("JUNIT 5", "123", publisher);
        author.getBooks().add(book);
        book.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(book);
    }
}
