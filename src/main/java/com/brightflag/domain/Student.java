package com.brightflag.domain;

import java.util.List;

public class Student {

	private Integer studentID;
	private String firstName;
	private String lastName;
	private List<Subject> subjects;
	private List<Exam> exams;
	private List<Grade> grades;

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student{" +
				"studentID=" + studentID +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", subjects=" + subjects +
				", exams=" + exams +
				", grades=" + grades +
				'}';
	}
}
