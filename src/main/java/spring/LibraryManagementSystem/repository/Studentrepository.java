package spring.LibraryManagementSystem.repository;

import org.springframework.data.repository.CrudRepository;

import spring.LibraryManagementSystem.model.Student;

public interface Studentrepository extends CrudRepository<Student, Integer> {

}
