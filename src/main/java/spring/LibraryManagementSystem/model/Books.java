package spring.LibraryManagementSystem.model;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Component
@Entity

public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  bookid;
	private String bookname;
	private String authorname;
	private String dateofregister;
    private int noofbooks;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getDateofregister() {
		return dateofregister;
	}
	public void setDateofregister(String dateofregister) {
		this.dateofregister = dateofregister;
	}
	public int getNoofbooks() {
		return noofbooks;
	}
	public void setNoofbooks(int noofbooks) {
		this.noofbooks = noofbooks;
	}
	public Books(int bookid, String bookname, String authorname, String dateofregister, int noofbooks) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
		this.dateofregister = dateofregister;
		this.noofbooks = noofbooks;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + ", dateofregister="
				+ dateofregister + ", noofbooks=" + noofbooks + "]";
	}
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}