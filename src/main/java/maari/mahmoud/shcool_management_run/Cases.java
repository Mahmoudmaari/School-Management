package maari.mahmoud.shcool_management_run;

import java.nio.channels.NetworkChannel;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import maari.mahmoud.shcool_management.data.CourseDao;
import maari.mahmoud.shcool_management.data.CourseDaoList;
import maari.mahmoud.shcool_management.model.Course;

public class Cases {

	Scanner ins = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	String input;
	LocalDate date;
	CourseDao newCourse = new CourseDaoList();
	private Course course;
	InputAndPrintout in = new InputAndPrintout();
	private int courseId = 0;
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

			System.out.println("\nPress (1) to create " + "\nPress (2) to search course by ID"
					+ "\nPress (3) to search course by name" + "\nPress (4) to search course by start date"
					+ "\nPress (5) to show all courses" + "\nPress (6) to remove coures by ID"
					+ "\nPress (7) to edit courses");

			switch (input = sc.nextLine()) {
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
			default:
				System.out.println("Not valid number");
				break;
			}
		}
	}

	
	public void cases1() {
		System.out.println("\nPress (1) to edit course name" + "\nPress (2) to edit course date"
				+ "\nPress (3) to edit course week duration");
		input = ins.nextLine();
		switch (input) {
		case "1":
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

}
