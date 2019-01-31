package maari.mahmoud.shcool_management_run;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import maari.mahmoud.shcool_management.data.CourseDao;
import maari.mahmoud.shcool_management.data.CourseDaoList;
import maari.mahmoud.shcool_management.data.StudentDao;
import maari.mahmoud.shcool_management.data.Student_Dao_List;
import maari.mahmoud.shcool_management.model.Course;
import maari.mahmoud.shcool_management.model.Student;

public class Cases {
	/*
	 * made by Mahmoud
	 */
	Scanner ins = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	String input;
	LocalDate date;
	CourseDao newCourse = new CourseDaoList();
	StudentDao newStudent = new Student_Dao_List();
	private Course course;
	private Student students;
	InputAndPrintout in = new InputAndPrintout();
	private int courseId = 0;
	private int studentId = 0;
	boolean run = true;

	public void cases() {
		course = new Course(courseId++, "English", LocalDate.of(2019, 2, 10), 10);
		newCourse.saveCourse(course);
		course = new Course(courseId++, "ww", LocalDate.of(2019, 2, 10), 10);
		newCourse.saveCourse(course);
		course = new Course(courseId++, "er", LocalDate.of(2019, 2, 10), 10);
		newCourse.saveCourse(course);
		System.out.println("######################################");
		System.out.println("#                                    #");
		System.out.println("#              Welcome               #");
		System.out.println("#                                    #");
		System.out.println("######################################");
		while (run) {

			switch (in.courseSettings()) {
			case "1":
				course = new Course(courseId++, in.Coursename(), LocalDate.of(in.year(), in.month(), in.day()),
						in.weekduration());
				System.out.println(newCourse.saveCourse(course));
				break;
			case "2":
				System.out.println(newCourse.findById(in.id()));
				break;
			case "3":
				System.out.println(newCourse.findByName(in.Coursename()));
				break;
			case "4":

				System.out.println(newCourse.findBuDate(date.of(in.year(), in.month(), in.day())));
				break;
			case "5":
				System.out.println(newCourse.findAll());
				break;
			case "6":
				System.out.println(newCourse.removeCourse(newCourse.findById(in.id())));
				break;
			case "7":
				cases1();
				break;
			case "8":
				studentcase();
				break;
			default:
				System.out.println("Not valid number");
				break;
			}
		}
	}

	public void cases1() {

		switch (in.courseEdit()) {
		case "1":
			System.out.println("Enter course ID");
			course = pickcourse(newCourse.findById(in.id()));

			System.out.println(course);
			break;
		case "2":
			course = pickcourseDeta(newCourse.findById(in.id()));
			System.out.println(course);
			break;
		case "3":
			course = pickcourseWeek(newCourse.findById(in.id()));
			System.out.println(course);
			break;

		default:
			System.out.println("not valid number");
			break;
		}
	}

	public void studentcase() {

		switch (in.StudentSettings()) {
		case "1":
			students = new Student(studentId++, in.Sname(), in.Semail(), in.Saddres());
			System.out.println(newStudent.saveStudent(students));
			break;
		case "2":
			System.out.println(newStudent.findById(in.Sid()));
			break;
		case "3":
			System.out.println(newStudent.findByName(in.Sname()));
			break;
		case "4":
			System.out.println(newStudent.findByEmail(in.Semail()));
			break;
		case "5":
			System.out.println(newStudent.findAll());
			break;
		case "6":
			course = pickcoursestudent(newCourse.findById(in.id()));
			System.out.println(course);
			break;
		case "7":
			course = pickcoursestudentremove(newCourse.findById(in.id()));
			System.out.println(course);
			break;
		case "8":
			studentedit();
			break;
		default:
			System.out.println("Not vaild number");
			break;
		}

	}

	public void studentedit() {
		System.out.println("\nPress (1) to edit the student name" + "\nPress (2) to edit the student E-mail"
				+ "\nPress (3) to edit the student address ");

		switch (in.StudentEdit()) {
		case "1":
			students = pickStudentName(newStudent.findById(in.Sid()));
			System.out.println(students);
			break;
		case "2":
			students = pickStudentEmail(newStudent.findById(in.Sid()));
			System.out.println(students);
			break;
		case "3":
			students = pickStudentAddress(newStudent.findById(in.Sid()));
			System.out.println(students);
			break;
		default:
			System.out.println("Not valid number");
			break;
		}
	}

	Course pickcourse(Course c) {

		String course = null;
		boolean run = true;
		Course pick;

		do {
			System.out.println("Enter the selected ID again");
			pick = newCourse.findById(ins.nextInt());
			if (pick != null) {
				run = false;

				course = c.setCourseName(in.Coursename());
			} else {
				System.out.println("Not a vaild pick");
			}

		} while (run);
		return pick;
	}

	Course pickcourseDeta(Course c) {

		LocalDate course = null;
		boolean run = true;
		Course pick;

		do {
			System.out.println("Enter the selected ID again");
			pick = newCourse.findById(ins.nextInt());
			if (pick != null) {
				run = false;

				course = c.setStartdate(course.of(in.year(), in.month(), in.day()));
			} else {
				System.out.println("Not a vaild pick");
			}

		} while (run);
		return pick;
	}

	Course pickcoursestudent(Course c) {

		List<Student> students = null;
		boolean run = true;
		Course pick;

		do {
			System.out.println("Enter the selected ID again");
			pick = newCourse.findById(ins.nextInt());
			if (pick != null) {
				run = false;

				students = c.register(newStudent.findById(in.Sid()));
			} else {
				System.out.println("Not a vaild pick");
			}

		} while (run);
		return pick;
	}

	Course pickcoursestudentremove(Course c) {

		List<Student> students = null;
		boolean run = true;
		Course pick;

		do {
			System.out.println("Enter the selected ID again");
			pick = newCourse.findById(ins.nextInt());
			if (pick != null) {
				run = false;

				students = c.unregister(newStudent.findById(in.Sid()));
			} else {
				System.out.println("Not a vaild pick");
			}

		} while (run);
		return pick;
	}

	Course pickcourseWeek(Course c) {

		int course = 0;
		boolean run = true;
		Course pick;

		do {
			System.out.println("Enter the selected ID again");
			pick = newCourse.findById(ins.nextInt());
			if (pick != null) {
				run = false;

				course = c.setWeekduration(in.weekduration());
			} else {
				System.out.println("Not a vaild pick");
			}

		} while (run);
		return pick;
	}

	Student pickStudentName(Student s) {
		String name;
		boolean run = true;
		Student pick;
		do {
			System.out.println("Enter the selected ID again");
			pick = newStudent.findById(ins.nextInt());
			if (pick != null) {
				run = false;
				name = s.setName(in.Sname());
			} else {
				System.out.println("Not a vaild pick");
			}

		} while (run);
		return pick;
	}

	Student pickStudentEmail(Student s) {
		String name;
		boolean run = true;
		Student pick;
		do {
			System.out.println("Enter the selected ID again");
			pick = newStudent.findById(ins.nextInt());
			if (pick != null) {
				run = false;
				name = s.setEmail(in.Semail());
			} else {
				System.out.println("Not a vaild pick");
			}

		} while (run);
		return pick;
	}

	Student pickStudentAddress(Student s) {
		String name;
		boolean run = true;
		Student pick;
		do {
			System.out.println("Enter the selected ID again");
			pick = newStudent.findById(ins.nextInt());
			if (pick != null) {
				run = false;
				name = s.setAddress(in.Saddres());
			} else {
				System.out.println("Not a vaild pick");
			}

		} while (run);
		return pick;
	}

}
