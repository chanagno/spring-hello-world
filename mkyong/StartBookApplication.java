package com.mkyong;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StartBookApplication {


    @Autowired
    private AuthorRepository repository;
    @Autowired
    private BookRepository repositoryBooks;
    
    
    public static void main(String[] args) {
        SpringApplication.run(StartBookApplication.class, args);
    }

	// init bean to insert 3 books into h2 database.
    @Bean
    CommandLineRunner initDatabase() {
        return args -> {
//        	Author[] authors=new Author[]{new Author("John","Jackson"),new Author("Mike","Jone")};
//         
//            repository.saveAll(new Book("A Guide to the Bodhisattva Way of Life",authors, new BigDecimal("15.41")));
           
        	Author a = new Author("John","Jackson");
        	a = repository.save(a);

        	Author b = new Author("Mike","Jone");
        	b = repository.save(b);
        	
        	Book bk = new Book();
        	bk.setName("my book");
        	bk.setPrice( new BigDecimal("15.41") );
        	bk.addAuthor(a);
        	bk.addAuthor(b);;
			repositoryBooks.save(bk);
        };
    }
    

}

