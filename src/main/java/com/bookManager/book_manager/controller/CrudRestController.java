package com.bookManager.book_manager.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookManager.book_manager.model.Book;
//import com.bookManager.book_manager.repo.BookRepo;
import com.bookManager.book_manager.service.CrudService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class CrudRestController {
	

	
	@Autowired 
	private CrudService service; 
	 

	 
	
	 @GetMapping("/book")
	 public List<Book> getAllBooks() {
		 List<Book> data = service.getBookFromRepo();
		 return data;
	 } 
	 
	 

	 
	 @PostMapping("/addBook")
	 public Book addBook(@RequestBody Book book) {
		 Book data = service.PersistBookIntoRepo(book);
		 return data;
	 } 
	 
	 
	 
	 @PostMapping("/updateBook")
	 public Book updateBook(@RequestBody Book book) {
		 Book data = service.UpdateBookIntoRepo(book);
		 return data;
	 } 
	 
	 
	 
	 

	 @GetMapping("/book/{id}")
	 public Book getbookById(@PathVariable("id") int id ) {
		 Book data = service.getBookById(id).get();
		 return data;
	 }
	 

	 
	  @DeleteMapping("/deleteBook/{id}")
	  public void deleteBook(@PathVariable int id){
	      
		  service.deleteProductById(id);
	    	   	  
	  }
	    
	    
	    
	    
	 
}
