package maari.mahmoud.shcool_management.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import maari.mahmoud.shcool_management.data.StudentDao;
import maari.mahmoud.shcool_management.data.Student_Dao_List;

public class Course {
	/*
	 * made by Mahmoud
	 */

	private int courseId;
	private String courseName;
	private LocalDate startdate;
	private int weekduration;
	private List<Student> students = new ArrayList<>();

	public Course() {

	}

	public Course(int id, String courseName, LocalDate date, int weekduration) {

		this.courseId = id;
		this.courseName = courseName;
		this.startdate = date;
		this.weekduration = weekduration;

	}

	public int setCourseId(int courseId) {
		return this.courseId = courseId;
	}

	public int getCourseId() {
		return courseId;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", startdate=" + startdate
				+ ", weekduration=" + weekduration + ", students=" + students + "]" + "\n";
	}

	public String getCourseName() {
		return courseName;
	}

	public String setCourseName(String courseName) {
		return this.courseName = courseName;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public LocalDate setStartdate(LocalDate startdate) {
		return this.startdate = startdate;
	}

	public int getWeekduration() {
		return weekduration;
	}

	public int setWeekduration(int weekduration) {
		return this.weekduration = weekduration;
	}

	public List<Student> getStudents() {
		return students;
	}

	public List<Student> setStudents(List<Student> students) {

		return this.students = students;
	}

	public List<Student> register(Student students) {
		getStudents().add(students);
		return getStudents();
	}

	public List<Student> unregister(Student students) {
		getStudents().remove(students);
		return getStudents();

	}

}
