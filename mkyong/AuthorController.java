package com.mkyong;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    private AuthorRepository repository;

    // Find
    @GetMapping("/authors")
    List<Author> findAll() {
        return repository.findAll();
    }

    // Save
    //return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/authors")
    Author newAuthor(@RequestBody Author newBook) {
        return repository.save(newBook);
    }
    
  // Find
  @GetMapping("/authors/{id}")
  Author findOne(@PathVariable Long id) {
	  
      return repository.findById(id).get();
  }
    
    

}
