package it.aulab.springlog.repository;

import java.util.List;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import it.aulab.springlog.model.Author;

public interface PagingAndSortingRepository  extends ListPagingAndSortingRepository<Author , Long>{ //JpaRepository
    
    
}
