package it.aulab.progettofinale.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.aulab.progettofinale.model.Course;
import it.aulab.progettofinale.model.Student;
import it.aulab.progettofinale.repository.CourseRepository;
import it.aulab.progettofinale.repository.StudentRepository;



@RestController
@RequestMapping("api/students")
public class RestStudentController {



    @Autowired
    CourseRepository courseRepository;

    @Autowired
    StudentRepository studentRepository;

 
    @GetMapping("{id}/{idCourse}")
    public Student addCourse(@PathVariable("id") Long id, @PathVariable("idCourse") Long idCourse) throws Exception{
    
        Student student = studentRepository.findById(id).get();
        Course course = courseRepository.findById(idCourse).get();
        
        
        course.getStudents().add(student);
        courseRepository.save(course);

        return studentRepository.findById(id).get();


       
    }

}
