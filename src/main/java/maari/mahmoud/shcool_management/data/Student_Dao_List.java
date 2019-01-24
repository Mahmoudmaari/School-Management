package maari.mahmoud.shcool_management.data;

import java.util.ArrayList;
import java.util.List;

import maari.mahmoud.shcool_management.model.Student;

public class Student_Dao_List implements StudentDao{

	List<Student> students=new ArrayList<>();
	
	
	
	
	
	
	

	@Override
	public Student saveStudent(Student student) {
		if (student==null) {
			throw new IllegalArgumentException();
			
		}
		
		if (findById(student.getId())==null){
			students.add(student);
		}
		
		return student;		
		
	}

	@Override
	public Student findByEmail(String email) {		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
		
	}












