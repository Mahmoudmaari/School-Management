package maari.mahmoud.shcool_management_course;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import School_management.*;


public  class Course{
	private int courseId;
	private String courseName;
	private LocalDate startdate;
	private int weekduration;
	private List <Student> students=new ArrayList<>();
	
	
	
	public Course(int id,String courseName,LocalDate date,int weekduration) {
	
		this.courseId=id;
		this.courseName= courseName;
		this.startdate=date;
		this.weekduration=weekduration;
	
	   
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	public int getWeekduration() {
		return weekduration;
	}
	public void setWeekduration(int weekduration) {
		this.weekduration = weekduration;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {

		this.students = students;
	}

	
	public void register(Student students) {
		
		
	}
	
	public void unregister(Student students) {
		
	}
	
}
