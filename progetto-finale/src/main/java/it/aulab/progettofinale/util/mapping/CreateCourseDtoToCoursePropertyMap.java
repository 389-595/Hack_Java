package it.aulab.progettofinale.util.mapping;

import org.modelmapper.PropertyMap;

import it.aulab.progettofinale.dto.CreateCourseDTO;
import it.aulab.progettofinale.model.Course;



public class CreateCourseDtoToCoursePropertyMap extends PropertyMap<CreateCourseDTO, Course>{

    @Override
    protected void configure() {
        using(new ConvertStringToDate()).map(source.getDate()).setDate(null);
    }
    
}
