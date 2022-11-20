package com.jbk.student.service;

import java.util.List;

import com.jbk.student.entity.Student;

public interface StudentService {

	public boolean saveStudents(Student student);

	public List<Student> getAllStudents();

	public boolean deleteStudent(int studentId);

	public boolean updateStudent(Student student);

}
