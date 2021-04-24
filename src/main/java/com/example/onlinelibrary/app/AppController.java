package com.example.onlinelibrary.app;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/book")
public class AppController {
    private final AppService appService;

    public AppController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping(path = "/title/{title}", produces = "application/json")
    public Map<String, Object> getBookByTitle(@PathVariable String title){
        return Map.of("Books",appService.getByTitle(title));
    }

    @GetMapping(path = "/IBAN/{IBAN}", produces = "application/json")
    public Map<String, Object> getBookByIBAN(@PathVariable String IBAN){
        return Map.of("Books",appService.getByIBAN(IBAN));
    }

}
