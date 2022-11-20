package com.jbk.student.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.student.dao.StudentDao;
import com.jbk.student.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;

	@Override
	public boolean saveStudents(Student student) {
		boolean saveStudent = studentDao.saveStudent(student);
		return true;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> allStudent = studentDao.getAllStudent();

		return allStudent;
	}

	@Override
	public boolean deleteStudent(int studentId) {
		boolean deleteStudent = studentDao.deleteStudent(studentId);
		return deleteStudent;
	}

	@Override
	public boolean updateStudent(Student student) {
		boolean updateStudent = studentDao.updateStudent(student);
		return updateStudent;
	}

}