


package com.bookManager.book_manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookManager.book_manager.model.Book;
import com.bookManager.book_manager.repo.BookRepo;

@Service
public class CrudService {
	
	
	@Autowired
	private BookRepo repo;
	
	
	public List<Book> getBookFromRepo(){
		return repo.findAll();
	}
	
	public Book PersistBookIntoRepo(Book book) {
		return repo.save(book);
	}
	
	
	public Book UpdateBookIntoRepo(Book book) {
		return repo.save(book);
	}
	
	
	public Optional<Book> getBookById(int id) {
		return repo.findById(id);
	}
	
	public void deleteProductById(int id) {

		repo.deleteById(id);
	}
	
	
}
