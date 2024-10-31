package spring.LibraryManagementSystem.controller;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import spring.LibraryManagementSystem.model.Books;
import spring.LibraryManagementSystem.model.Borrow;
import spring.LibraryManagementSystem.model.Returnbook;
import spring.LibraryManagementSystem.model.Student;
import spring.LibraryManagementSystem.repository.Borrowrepository;
import spring.LibraryManagementSystem.repository.Returnrepository;
import spring.LibraryManagementSystem.repository.booksrepository;
import spring.LibraryManagementSystem.service.bookservice;

@RestController
public class bookmanagcontroller {
@Autowired
	booksrepository brepo;
	
	@Autowired
	bookservice bservice;
	
	@Autowired
	Books books;
	
	@Autowired 
	Student student;
	
	@Autowired
	Borrow borrow;
	
	@Autowired
	Returnrepository rerepo;
	
	@Autowired
	Borrowrepository borepo;
	
	
@RequestMapping("/")
	public String display() {
		return "index";
	}
	
@PostMapping("/bookregister")
public String bookregister(@RequestBody Books books ) {
	
	String message=bservice.bookregister(books);
	
	return message;
	
}
	
@PostMapping("/studentregister")
public String  studentregister(@RequestBody Student student) {
	
	
	String message=bservice.studentregister(student);
	return message;
	
}
	
@PostMapping("/borrowbooks/{stdid}/{bookid}")
public String borrowbooks(@PathVariable int  stdid, @PathVariable int bookid) {
	
	
String message=	bservice.borrowbook(bookid,stdid);
	
	
	
	return message;
	
}

@PostMapping("/returnbook/{borrowid}")
public String returnbook(@PathVariable int borrowid) {
	
String message=	bservice.returnbooks(borrowid);
	
	
	
	return message;
	
}


@GetMapping("/listofborrowedbooks")
public List<Borrow> listofborrowedbooks() {
	List<Borrow> listofborrowedbooks = bservice.listofborrowedbooks();
	return listofborrowedbooks;
	
}


@GetMapping("/listofreturnedbooks")
public List<Returnbook> listofreturnbook(){
	List<Returnbook> listofreturnedbooks = bservice.listofreturnedbooks();	
	return listofreturnedbooks;
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
