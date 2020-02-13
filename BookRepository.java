package com.mkyong;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


// Spring Data magic :)
public interface BookRepository extends JpaRepository<Book, Long> {
	
	
	Optional<Book> findById(Long id);
	List<Book> findAll();

}
