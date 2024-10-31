package spring.LibraryManagementSystem.repository;

import org.springframework.data.repository.CrudRepository;

import spring.LibraryManagementSystem.model.Borrow;

public interface Borrowrepository extends CrudRepository<Borrow, Integer>{

}
