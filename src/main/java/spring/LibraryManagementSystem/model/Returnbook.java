package spring.LibraryManagementSystem.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Component
@Entity
public class Returnbook {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int returnid;
	private LocalDate returndate;
	
	@OneToOne
	Borrow borrow;

	public int getReturnid() {
		return returnid;
	}

	public void setReturnid(int returnid) {
		this.returnid = returnid;
	}

	public LocalDate getReturndate() {
		return returndate;
	}

	public void setReturndate(LocalDate returndate) {
		this.returndate = returndate;
	}

	public Borrow getBorrow() {
		return borrow;
	}

	public void setBorrow(Borrow borrow) {
		this.borrow = borrow;
	}

	public Returnbook(int returnid, LocalDate returndate, Borrow borrow) {
		super();
		this.returnid = returnid;
		this.returndate = returndate;
		this.borrow = borrow;
	}

	public Returnbook() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Returnbook [returnid=" + returnid + ", returndate=" + returndate + ", borrow=" + borrow + "]";
	}
	
	
	
	
	
	
}
