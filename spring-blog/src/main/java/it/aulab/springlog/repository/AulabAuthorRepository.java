package it.aulab.springlog.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.aulab.springlog.model.Author;

public interface AulabAuthorRepository extends CrudRepository<Author, Long>{
   
    List<Author> findQualcosa(String partialEmail);
    
}
