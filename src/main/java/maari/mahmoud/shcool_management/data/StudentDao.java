package maari.mahmoud.shcool_management.data;

import java.util.List;

import maari.mahmoud.shcool_management.model.Student;

public interface StudentDao {
	String schoolName="wasa";

Student saveStudent(Student student);
Student findByEmail(String email);
List<Student>findByName(String name); 
Student findById(int id);
boolean deleteStudent(Student student);
 List<Student> findAll();
}
