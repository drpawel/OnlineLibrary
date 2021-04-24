package com.example.onlinelibrary.app;

import com.example.onlinelibrary.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppService {
    private List<Book> repository;

    public AppService(List<Book> repository) {
        this.repository = repository;
        repository.add(new Book("Ferdydurke","1998484167","Witold Gombrowicz"));
    }

    public List<Book> getByTitle(String title){
        return repository.stream()
                .filter(x -> x.getTitle().contains(title))
                .collect(Collectors.toList());
    }

    public List<Book> getByIBAN(String IBAN){
        return repository.stream()
                .filter(x -> x.getIBAN().equals(IBAN))
                .collect(Collectors.toList());
    }

}
