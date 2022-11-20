package com.jbk.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Student {

	@Id
	private int studentId;   // stata type

	@NotNull(message = "studentName is required")
	private String studentName;

	@NotNull(message = "enter the subject as per student std")
	private String subjectNames;

	private	int studentMarks;

	public Student(int studentId, @NotNull(message = "studentName is required") String studentName,
			@NotNull(message = "enter the subject as per student std") String subjectNames,  int studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.subjectNames = subjectNames;
		this.studentMarks = studentMarks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSubjectNames() {
		return subjectNames;
	}

	public void setSubjectNames(String subjectNames) {
		this.subjectNames = subjectNames;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", subjectNames=" + subjectNames
				+ ", studentMarks=" + studentMarks + "]";
	}

}