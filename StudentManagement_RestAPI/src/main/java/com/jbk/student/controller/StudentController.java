package com.jbk.student.controller;

import java.util.List;
import java.util.Map;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.student.entity.Student;
import com.jbk.student.exception.StudentNotFoundException;
import com.jbk.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/saveStudent")
	public ResponseEntity<Boolean> saveProduct(@Valid @RequestBody Student student) {// Data validation

		boolean isAdded = studentService.saveStudents(student);

		if (isAdded) {
			return new ResponseEntity<Boolean>(isAdded, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Boolean>(isAdded, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}
	@GetMapping(value = "/getAllProduct")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> allStudents = studentService.getAllStudents();
		if (!allStudents.isEmpty()) {
			return new ResponseEntity<List<Student>>(allStudents, HttpStatus.OK);
		} else {
			throw new StudentNotFoundException("Students Not Found");

		}

	}

	@DeleteMapping(value = "/deleteStudentById/{studentId}")
	public ResponseEntity<Boolean> deleteStudentById(@PathVariable int studentId) {
		boolean isDeleted = studentService.deleteStudent(studentId);
		if (isDeleted) {
			return new ResponseEntity<>(isDeleted, HttpStatus.OK);
		} else {
			throw new StudentNotFoundException("Student Not Found For Id :" + studentId);
		}
	}

	@PutMapping(value ="/updateProduct")
	public ResponseEntity<Boolean> updateStudent(@RequestBody Student student) {
		boolean isUpdated = studentService.updateStudent(student);
		if (isUpdated) {
			return new ResponseEntity<Boolean>(isUpdated, HttpStatus.OK);
		} else {
			throw new StudentNotFoundException("Student Not Found For Update with Id :" + student.getStudentId());

		}
	}
}