package maari.mahmoud.shcool_management_course;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseDeoList implements CourseDeo {
	
	

	private static List<Course> courses=new ArrayList<>();
	
	

	
	@Override
	public Course saveCourse(Course course) throws IllegalArgumentException {
		if(course == null) {
			throw new IllegalArgumentException();
		}
		if (findById(course.getCourseId())!=null){
			throw new IllegalArgumentException("Object with same id exists in storage");
		}else {
	
	   courses.add(course);
		return course;
		}
	}

	@Override
	public Course findById(int id) {
		for(Course c : courses) {
			if(c.getCourseId() == id) {
				return c;
			}
		}
		
		return null;
	}

	@Override
	public List<Course> findByName(String name) {
		List<Course> result = new ArrayList<>();
	    
		for(Course e : courses) {
			
			if(e.getCourseName().equalsIgnoreCase(name)) {
				result.add(e);
				
			}
		}
		
		return result;
	}

	@Override
	public List<Course> findBuDate(LocalDate date) {
		List<Course> result = new ArrayList<>();
		
		for(Course c: courses) {
			if(c.getStartdate().equals(date)) {
				result.add(c);
			}
		}
		return result;
	}

	@Override
	public List<Course> findAll() {
		
		return getCourses();
	}

	@Override
	public boolean removeCourse(Course course) {
		
		return courses.remove(course);
	}

	public static List<Course> getCourses() {
		return courses;
	}

	public static void setCourses(List<Course> courses) {
		CourseDeoList.courses = courses;
	}

	public static void clear() {
		courses.clear();
	}
}
