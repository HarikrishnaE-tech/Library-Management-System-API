package spring.LibraryManagementSystem.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import spring.LibraryManagementSystem.model.Books;
import spring.LibraryManagementSystem.model.Borrow;
import spring.LibraryManagementSystem.model.Returnbook;
import spring.LibraryManagementSystem.model.Student;
import spring.LibraryManagementSystem.repository.Borrowrepository;
import spring.LibraryManagementSystem.repository.Returnrepository;
import spring.LibraryManagementSystem.repository.Studentrepository;
import spring.LibraryManagementSystem.repository.booksrepository;

@Service
public class bookservice {

	@Autowired
	booksrepository brepo;
	
	@Autowired
	Studentrepository srepo;
	
	@Autowired
	Borrowrepository borepo;
	
	@Autowired
	Returnrepository rerepo;
	
	
	
	
public String bookregister(Books books) {
	brepo.save(books);
	String message="book registred successfully";
	
	return message;
	
}
	
	public String studentregister(Student student) {
		srepo.save(student);
		String message="the student registred successfully";
		return message;
		
	}
	
	
	public String borrowbook( int stdid,int bookid) {
	Optional<Books> books=	brepo.findById(bookid);
    Optional<Student> student = srepo.findById(stdid);
    String message="borrowed successfully";
    if(books.isPresent() && student.isPresent()) {
    	Borrow borrow=new Borrow();
    	borrow.setBooks(books.get());
    	borrow.setStudent(student.get());
    	borrow.setDateofborrow(LocalDate.now());
    	borepo.save(borrow);
    	
    }
    else {
    	throw new RuntimeException("student or book noit found");
    }
	return message;
		
	
		
	}
	
	public String returnbooks(int borrowid) {
		Optional<Borrow> bid = borepo.findById(borrowid);
		String message="the book has been returned";
		if(bid.isPresent()) {
			Returnbook rt=new Returnbook();
			rt.setBorrow(bid.get());
			rt.setReturndate(LocalDate.now());
			
		
		}
		else {
			throw new RuntimeException("no books have been borrowed");
		}
		
		return message;
		
	}
	
	
	public List<Borrow> listofborrowedbooks() {
		Iterable<Borrow> all = borepo.findAll();
		List<Borrow> borrowlist=new ArrayList<>();
	all.forEach(borrowlist::add);
		return borrowlist;
		
	}
	
	
	public List<Returnbook> listofreturnedbooks(){
		Iterable<Returnbook> all = rerepo.findAll();
		List<Returnbook> lbook=new ArrayList();
		all.forEach(lbook::add);
		
		return lbook;
		
	}
	
	
	
	
	
}
