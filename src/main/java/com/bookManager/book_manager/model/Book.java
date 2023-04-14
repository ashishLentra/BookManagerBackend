

package com.bookManager.book_manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
//@SequenceGenerator(name = "port_gen", sequenceName = "port_gen",  initialValue = 4700)
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.AUTO, generator = "port_gen")
	private int id;
	
	private String title;
	
	private String author;
	
	private String imgUrl;
	
	private int publicationYear;

	Book(){
		
	}
	
	public Book(int id, String title, String author, String imgUrl, int publicationYear) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.imgUrl = imgUrl;
		this.publicationYear = publicationYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	
}