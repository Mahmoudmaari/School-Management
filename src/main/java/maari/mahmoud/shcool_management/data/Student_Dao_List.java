package maari.mahmoud.shcool_management.data;

import java.util.ArrayList;
import java.util.List;

import maari.mahmoud.shcool_management.model.Course;
import maari.mahmoud.shcool_management.model.Student;

public class Student_Dao_List implements StudentDao {

	private static List<Student> students = new ArrayList<>();

	@Override
	public Student saveStudent(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		}

		if (findById(student.getId()) == null) {
			// for each element of the list "students",bring its id and test it ,
			// if this object which has null id =null then add new student
			students.add(student);
		} else
			System.out.println("id is existed");
		return student;

	}

	@Override
	public Student findByEmail(String email) {
		for (Student c : students) {
			// bringing email for each student from the list students and
			// comparing it with the email taken from the user then
			// put result in c which is object in class Student
			if (c.getEmail().equalsIgnoreCase(email)) {

				return c;
			}

		}
		return null;

	}

	@Override
	public List<Student> findByName(String name) {
		List<Student> result = new ArrayList<>();
		for (Student s : students) {

			if (s.getName().equalsIgnoreCase(name)) {
				result.add(s);
			}

		}
		return result;
	}

	@Override
	public boolean deleteStudent(Student student) {

		return students.remove(student);
	}

	@Override
	public List<Student> findAll() {
		return getStudents();
	}

	@Override
	public Student findById(int id) {
		for (Student c : students) {
			if (c.getId() == id) {

				return c;
			}

		}
		return null;
	}

	public static List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		Student_Dao_List.students = students;
	}

	public static void clear() {
		students.clear();
	}
}
