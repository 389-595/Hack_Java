package it.aulab.progettofinale.util.mapping;

import org.modelmapper.PropertyMap;

import it.aulab.progettofinale.dto.CourseDTO;
import it.aulab.progettofinale.model.Course;



public class CourseToCourseDtoPropertyMap extends PropertyMap<Course, CourseDTO>{

    @Override
    protected void configure() {
        using(new ConvertCollectionToInteger()).map(source.getStudents()).setNumberOfStudents(null);
    }
    
}
