package spring.LibraryManagementSystem.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Component
@Entity
public class Borrow {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int borrowid;
	private LocalDate dateofborrow;
	
	@ManyToOne
	Student student;
	
	@ManyToOne
	Books books;
	
	@OneToOne
	Returnbook returnbook;

	public int getBorrowid() {
		return borrowid;
	}

	public void setBorrowid(int borrowid) {
		this.borrowid = borrowid;
	}

	public LocalDate getDateofborrow() {
		return dateofborrow;
	}

	public void setDateofborrow(LocalDate dateofborrow) {
		this.dateofborrow = dateofborrow;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public Returnbook getRetrn() {
		return returnbook;
	}

	public void setRetrn(Returnbook retrn) {
		this.returnbook = returnbook;
	}

	public Borrow(int borrowid, LocalDate dateofborrow, Student student, Books books, Returnbook returnbook) {
		super();
		this.borrowid = borrowid;
		this.dateofborrow = dateofborrow;
		this.student = student;
		this.books = books;
		this.returnbook = returnbook;
	}

	public Borrow() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Borrow [borrowid=" + borrowid + ", dateofborrow=" + dateofborrow + ", student=" + student + ", books="
				+ books + ", returnbook=" + returnbook + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
