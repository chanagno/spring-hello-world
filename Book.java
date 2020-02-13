package com.mkyong;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Basic
    private String name;
    //private Author(String name, String last);
    
    @OneToMany
    private Set<Author> authors= new HashSet<>();
    

	@Basic
    private BigDecimal price;
    
	
	public Book() {};


	

	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public BigDecimal getPrice() {
		return price;
	}




	public void setPrice(BigDecimal price) {
		this.price = price;
	}



	public Set<Author> getAuthors() {
		return authors;
	}




	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}




	public void addAuthor( Author a ) {
		this.authors.add(a);
	}
	
	
}
