package com.brightflag.domain;

import java.util.List;

public class Subject {

	private Integer subjectID;
	private String subjectName;
	private List<Student> students;

	public Integer getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(Integer subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Subject{" +
				"subjectID=" + subjectID +
				", subjectName='" + subjectName + '\'' +
				", students=" + students +
				'}';
	}
}
