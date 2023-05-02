package it.aulab.springlog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import it.aulab.springlog.model.Author;

public interface JpaAuthorRepository  extends JpaRepository<Author , Long> , AulabAuthorRepository{ //JpaRepository
    
    public List<Author> findByLastname(String lastname);
    public List<Author> findByFirstnameContain(String fn);
    public List<Author> findByFirstnameEquals(String fn);
    public List<Author> findByLastnameNotIgnoreCase(String lastname);
    public List<Author> findByFirstnameAndLastname(String a,String b);
    public List<Author> findByFirstnameOrLastname(String a,String b);
   

}
