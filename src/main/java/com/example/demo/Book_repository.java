package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Book;

public interface Book_repository extends JpaRepository<Book,Integer> {

	Book findByTitleAndAuthor(String title, String author);

}
