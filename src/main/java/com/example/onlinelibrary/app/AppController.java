package com.example.onlinelibrary.app;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * AppController
 */
@RestController
@RequestMapping("/api/book")
public class AppController {
    private final AppService appService;

    /**
     * AppController constructor
     * @param appService appService
     */
    public AppController(AppService appService) {
        this.appService = appService;
    }

    /**
     * Get book by part of book request method
     * @param title title of the book
     * @return List of books
     */
    @GetMapping(path = "/title/{title}", produces = "application/json")
    public Map<String, Object> getBookByTitle(@PathVariable String title){
        return Map.of("Books",appService.getByTitle(title));
    }

    /**
     * Get book by IBAN request method
     * @param IBAN IBAN of book
     * @return List of books
     */
    @GetMapping(path = "/IBAN/{IBAN}", produces = "application/json")
    public Map<String, Object> getBookByIBAN(@PathVariable String IBAN){
        return Map.of("Books",appService.getByIBAN(IBAN));
    }

}
