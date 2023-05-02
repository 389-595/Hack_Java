package it.aulab.progettofinale;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProgettoFinaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettoFinaleApplication.class, args);
	}

	@Bean
	public ModelMapper instancModelMapper() {
		ModelMapper mapper = new ModelMapper();
		mapper.addMappings(new CreateCourseDtoToCoursePropertyMap());
		mapper.addMappings(new CourseToCourseDtoPropertyMap());
		return mapper;
	}

}
