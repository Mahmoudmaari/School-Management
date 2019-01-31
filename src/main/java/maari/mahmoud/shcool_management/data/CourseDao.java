package maari.mahmoud.shcool_management.data;

import java.time.LocalDate;
import java.util.*;

import maari.mahmoud.shcool_management.model.Course;

public interface CourseDao {
	/*
	 * made by Mahmoud
	 */
	Course saveCourse(Course course);

	Course findById(int id);

	List<Course> findByName(String name);

	List<Course> findBuDate(LocalDate date);

	List<Course> findAll();

	boolean removeCourse(Course course);

}
