package it.aulab.progettofinale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aulab.progettofinale.model.Course;
import it.aulab.progettofinale.model.Person;

public interface CourseRepository extends JpaRepository<Course, Long>{
    
    List<Course> findByNameContaining(String name);
    List<Course> findByTeacherFirstNameContaining(Person teacherFirstName);
    List<Course> findByTeacherLastNameContaining(Person teacherLastName);

    List<Course> findByNameContainingAndTeacherFirstNameContaining(String name , Person teacherFirstName);
    List<Course> findByTeacherFirstNameContainingAndTeacherLastNameContaining(Person teacherFirstName,Person teacherLastName);
    List<Course> findByNameContainingAndTeacherLastNameContaining(String name, Person teacherLastName);
    List<Course> findByNameContainingAndTeacherFirstNameContainingAndTeacherLastNameContaining(String name,Person teacherFirstName,Person teacherLastNames);


   

}
