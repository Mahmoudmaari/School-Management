package maari.mahmoud.shcool_management_course;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseDeoList implements CourseDeo {
	
	private static List<Course> courses;
	Course m= new Course();

	@Override
	public Course saveCourse(Course course) {
		courses.add(course);
		return course;
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
	    List<Course> c = new ArrayList<>();
		for(Course e : courses) {
			c = (List<Course>) e;
			if(e.getCourseName() == name) {
				return  c ;
			}
		}
		
		return result;
	}

	@Override
	public List<Course> findBuDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeCourse(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	public static List<Course> getCourses() {
		return courses;
	}

	public static void setCourses(List<Course> courses) {
		CourseDeoList.courses = courses;
	}

}
