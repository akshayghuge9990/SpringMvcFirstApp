package com.BikkadIT.SpringMvcFirstApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.SpringMvcFirstApp.model.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView getBookData() {
		
		Book book= new Book();
		book.setBookId(111);
		book.setBookName("Java");
		book.setBookPrice(675.00);
		
		ModelAndView mav= new ModelAndView();
		mav.addObject("BOOKS", book);
		mav.setViewName("book");
		
		return mav;
		
		
	}
	
	@GetMapping("/getAllBook")
	public ModelAndView getAllBook() {
		
		Book book= new Book();
		book.setBookId(111);
		book.setBookName("Java");
		book.setBookPrice(675.00);
		
		Book book1= new Book();
		book1.setBookId(222);
		book1.setBookName("C++");
		book1.setBookPrice(675.00);
		
		Book book2= new Book();
		book2.setBookId(333);
		book2.setBookName("PYTHON");
		book2.setBookPrice(675.00);
		
		List<Book> books= new ArrayList<Book>();
		books.add(book);
		books.add(book1);
		books.add(book2);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("BOOKS",books);
		mav.setViewName("books");
		
		
		return mav;
		
	}
	
	
	
	
	
	
	
	
	
	

}
