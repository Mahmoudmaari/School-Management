package maari.mahmoud.shcool_management_run;

import java.util.Scanner;

public class InputAndPrintout {
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
		System.out.println("Enter the id");
		return i = in.nextInt();
	}

}
