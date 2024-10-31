package spring.LibraryManagementSystem.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Component
@Entity
public class Student {
@Id
	private int stdid;
	private String stdname;
@OneToMany
  List <Borrow> borrowlist;
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getStdname() {
	return stdname;
}
public void setStdname(String stdname) {
	this.stdname = stdname;
}
public List<Borrow> getBorrowlist() {
	return borrowlist;
}
public void setBorrowlist(List<Borrow> borrowlist) {
	this.borrowlist = borrowlist;
}
public Student(int stdid, String stdname, List<Borrow> borrowlist) {
	super();
	this.stdid = stdid;
	this.stdname = stdname;
	this.borrowlist = borrowlist;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [stdid=" + stdid + ", stdname=" + stdname + ", borrowlist=" + borrowlist + "]";
}

	









	
}
