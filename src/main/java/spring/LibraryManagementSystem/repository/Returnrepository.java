package spring.LibraryManagementSystem.repository;

import org.springframework.data.repository.CrudRepository;


import spring.LibraryManagementSystem.model.Returnbook;

public interface Returnrepository extends CrudRepository<Returnbook, Integer> {

}
