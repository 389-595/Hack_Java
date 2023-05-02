package it.aulab.progettofinale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aulab.progettofinale.model.Lesson;

public interface LessonRepository  extends JpaRepository<Lesson, Long>{
    
    

}
