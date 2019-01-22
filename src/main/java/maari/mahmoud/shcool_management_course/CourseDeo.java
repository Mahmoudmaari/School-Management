package maari.mahmoud.shcool_management_course;

import java.time.LocalDate;
import java.util.*;

public interface CourseDeo {
	
	Course saveCourse(Course course);
	Course findById(int id);
	List<Course>findByName(String name);
	List<Course>findBuDate(LocalDate date);
	List<Course>findAll();
	boolean removeCourse(Course course);
	
	

}
