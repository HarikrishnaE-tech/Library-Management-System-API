package spring.LibraryManagementSystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.LibraryManagementSystem.model.Books;

@Repository
public interface booksrepository extends CrudRepository<Books, Integer>  {


	
	
}
