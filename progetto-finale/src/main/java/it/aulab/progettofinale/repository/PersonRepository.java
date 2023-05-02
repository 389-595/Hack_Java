package it.aulab.progettofinale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aulab.progettofinale.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
