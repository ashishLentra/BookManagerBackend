package com.bookManager.book_manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookManager.book_manager.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
			
	
		
	
}
