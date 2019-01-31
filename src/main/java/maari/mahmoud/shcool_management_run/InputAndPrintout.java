package maari.mahmoud.shcool_management_run;

import java.util.Scanner;

public class InputAndPrintout {
	/*
	 * made by Mahmoud
	 */
	Scanner in = new Scanner(System.in);
	Scanner inS = new Scanner(System.in);

	public String Coursename() {
		String name;
		System.out.println("Enter course name : ");
		return name = inS.nextLine();

	}

	public int weekduration() {
		int week;
		System.out.println("Enter the weekduration for the course");
		return week = in.nextInt();
	}

	public int year() {
		int y;
		System.out.println("Enter the start year for the course");
		return y = in.nextInt();
	}

	public int month() {
		int m;
		System.out.println("Enter the start monthe for the course");
		return m = in.nextInt();
	}

	public int day() {
		int d;
		System.out.println("Enter the start day for the course");
		return d = in.nextInt();
	}

	public int id() {
		int i;
		System.out.println("Enter course id");
		return i = in.nextInt();
	}

	public int Sid() {
		int i;
		System.out.println("Enter student id");
		return i = in.nextInt();
	}

	public String Sname() {
		String s;
		System.out.println("Enter the student name");
		return s = in.nextLine();
	}

	public String Semail() {
		String s;
		System.out.println("Enter the student E-mail");
		return s = in.nextLine();
	}

	public String Saddres() {
		String s;
		System.out.println("Enter th student address");
		return s = in.nextLine();
	}

	public String courseSettings() {
		String s;
		System.out.println("\nPress (1) to create " + "\nPress (2) to search course by ID"
				+ "\nPress (3) to search course by name" + "\nPress (4) to search course by start date"
				+ "\nPress (5) to show all courses" + "\nPress (6) to remove coures by ID"
				+ "\nPress (7) to edit courses" + "\nPress (8) to go in to student settings");

		return s = in.nextLine();
	}

	public String courseEdit() {
		String s;
		System.out.println("\nPress (1) to edit course name" + "\nPress (2) to edit course date"
				+ "\nPress (3) to edit course week duration");
		return s = in.nextLine();
	}

	public String StudentSettings() {
		String s;
		System.out.println("\nPress (1) to add a student" + "\nPress (2) to search student by ID"
				+ "\nPress (3) to search student by name" + "\nPress (4) to search student by E-mail"
				+ "\nPress (5) to show all students" + "\nPress (6) to add student to a course"
				+ "\nPress (7) to remove student from a course" + "\nPress (8) to edit a student");
		return s = in.nextLine();
	}

	public String StudentEdit() {
		String s;
		System.out.println("\nPress (1) to edit the student name" + "\nPress (2) to edit the student E-mail"
				+ "\nPress (3) to edit the student address ");
		return s = in.nextLine();
	}

}
