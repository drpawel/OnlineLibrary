package com.example.onlinelibrary.app;

import com.example.onlinelibrary.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * App Service
 */
@Service
public class AppService {
    private List<Book> repository;

    /**
     * AppService constructor
     * @param repository book repository
     */
    public AppService(List<Book> repository) {
        this.repository = repository;
        repository.add(new Book("Ferdydurke","1998484167","Witold Gombrowicz"));
    }

    /**
     * List all books with specified part of title
     * @param title title of the book
     * @return list of books
     */
    public List<Book> getByTitle(String title){
        return repository.stream()
                .filter(x -> x.getTitle().contains(title))
                .collect(Collectors.toList());
    }

    /**
     * List all books with specified IBAN
     * @param IBAN IBAN of the book
     * @return list of books
     */
    public List<Book> getByIBAN(String IBAN){
        return repository.stream()
                .filter(x -> x.getIBAN().equals(IBAN))
                .collect(Collectors.toList());
    }

}
