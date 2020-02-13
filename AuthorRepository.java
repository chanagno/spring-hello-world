package com.mkyong;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


// Spring Data magic :)
public interface AuthorRepository extends JpaRepository<Author,Long> {
	
	List<Author> findByName(String name);
	
	//List<Author> findAll();
	
	
}