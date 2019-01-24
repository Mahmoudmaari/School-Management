package School_management;

import java.util.List;

public interface StudentDao {
	String schoolName="wasa";

Student saveStudent(Student student);
Student findByEmail(String email);
List<Student>findByName(String name); 
Student findById(int id);
boolean deleteStudent(Student student);
 Student findAll();
}
