package com.bookManager.book_manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookManager.book_manager.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
	
		
	
}
