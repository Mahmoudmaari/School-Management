package maari.mahmoud.shcool_management;

import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.List;
import org.junit.*;
import maari.mahmoud.shcool_management.data.*;
import maari.mahmoud.shcool_management.model.Course;

public class CourseTest {
	/*
	 * made by Mahmoud
	 */

	private CourseDao undertest = new CourseDaoList();
	private Course coursetest;
	private int courseId;

	@Before
	// before operating a test
	public void init() {
		coursetest = new Course(0, "lal", LocalDate.of(2019, 2, 10), 10);
		undertest.saveCourse(coursetest);
		courseId = coursetest.getCourseId();
		undertest.saveCourse(new Course(2, "test", LocalDate.of(2019, 2, 10), 20));
	}

	@After
	// operates after operating a test
	public void clear() {
		CourseDaoList.clear();

	}

	@Test
	public void courseSaveTest() {
		Course expected = new Course(3, "ahmad", LocalDate.of(2019, 2, 5), 10);

		assertEquals(expected, undertest.saveCourse(expected));

	}

	@Test
	public void findbyId() {
		assertEquals(coursetest, undertest.findById(courseId));
	}

	@Test
	public void findbyName() {
		String name = "lal";
		List<Course> result = undertest.findByName(name);
		for (Course c : result) {

			assertEquals(name, c.getCourseName());
		}
	}

	@Test
	public void findByDeta() {
		LocalDate date = LocalDate.of(2019, 2, 10);
		List<Course> result = undertest.findBuDate(date);
		for (Course c : result) {
			assertEquals(date, c.getStartdate());
		}
	}

	@Test
	public void findall() {
		List<Course> result = undertest.findAll();

		assertEquals(CourseDaoList.getCourses(), result);

	}

	@Test
	public void removeCourse() {
		boolean run = undertest.removeCourse(coursetest);
		assertTrue(run);
	}

	@Test
	public void StudentTest() {

	}
}
