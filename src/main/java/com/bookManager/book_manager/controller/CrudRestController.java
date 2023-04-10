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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookManager.book_manager.model.Book;
import com.bookManager.book_manager.repo.BookRepo;
//import com.bookManager.book_manager.service.CrudService;

@RestController
@CrossOrigin(origins = "*")
public class CrudRestController {
	
	 @Autowired
	 private BookRepo repo;
	
//	@Autowired
//	private CrudService service;
	 
	 @GetMapping("/book")
	 public List<Book> getAllBooks() {
		 List<Book> data = repo.findAll();
		 return data;
	 }
	 
	//get
//	 @GetMapping("/book")
//	 public List<Book> getAllBooks() {
//		 List<Book> data = service.getBookFromRepo();
//		 return data;
//	 }
	 
	 
	 @PostMapping("/addBook")
	 public Book addBook(@RequestBody Book book) {
		 Book data = repo.save(book);
		 return data;
	 }
	 
	 //post
//	 @PostMapping("/addBook")
//	 public Book addBook(@RequestBody Book book) {
//		 Book data = service.PersistBookIntoRepo();
//		 return data;
//	 }
//	 
	 

	 @GetMapping("/book/{id}")
	 public Book getbookById(@PathVariable("id") int id ) {
		 Book data = repo.findById(id).get();
		 return data;
	 }
	 
	 
	 //update
//	 @GetMapping("/book/{id}")
//	 public Book getbookById(@PathVariable("id") int id ) {
//		 Book data = service.getBookById(id).get();
//		 return data;
//	 }
	 

	 
	 

//	 
	  @DeleteMapping("/deleteBook/{id}")
	  public void deleteBook(@PathVariable int id){
	        //Logic to get delete product by id from database
	    	   repo.deleteById(id);
	    	

//	        return service.deleteProductById(id);
	  }
	 
	    //delete
//	    @DeleteMapping("/deleteBook/{id}")
//	    public String deleteBook(@PathVariable int id){
//	        //Logic to get delete product by id from database
//	    	  return service.deleteProductById(id);
//	    	  
//	    	  
//	    }
	    
	    
	    
	    
	 
}
