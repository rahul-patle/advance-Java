package com.jbk.student.dao;

import java.util.List;

import com.jbk.student.entity.Student;

public interface StudentDao {
	
	public boolean saveStudent(Student student);

	public List<Student> getAllStudent();

	public boolean deleteStudent(int studentId);

	public boolean updateStudent(Student student);
	


}
