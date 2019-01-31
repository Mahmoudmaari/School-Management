package maari.mahmoud.shcool_management;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import maari.mahmoud.shcool_management.data.CourseDeoList;
import maari.mahmoud.shcool_management.data.StudentDao;
import maari.mahmoud.shcool_management.data.Student_Dao_List;
import maari.mahmoud.shcool_management.model.Course;
import maari.mahmoud.shcool_management.model.Student;

public class student_test {
	private StudentDao undertest = new Student_Dao_List();

	private Student studenttest;
	private int studentId;

	@Before
	public void init() {

		studenttest = new Student(3, "falak", "falak@gmail.com", "konga");
		undertest.saveStudent(studenttest);
		studentId = studenttest.getId();
		undertest.saveStudent(new Student(4, "Ali", " Ali@gmail.com", "Nybro"));
	}

	@After
	public void clear() {
		Student_Dao_List.clear();

	}

	@Test
	public void studentSaveTest() {
		Student expected = new Student(3, "ahmad", "Ahmad@gmail.com", "Syria");

		assertEquals(expected, undertest.saveStudent(expected));

	}

	@Test
	public void findbyId() {
		assertEquals(studenttest, undertest.findById(studentId));
	}

	@Test
	public void findbyName() {
		String name = "falak";
		List<Student> result = undertest.findByName(name);
		for (Student c : result) {

			assertEquals(name, c.getName());
		}
	}

	@Test
	public void findall() {
		List<Student> result = undertest.findAll();

		assertEquals(Student_Dao_List.getStudents(), result);

	}

	@Test
	public void removeStudent() {
		boolean run = undertest.deleteStudent(studenttest);
		assertTrue(run);
	}
}
