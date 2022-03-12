package com.desafiolatam.dao;

import java.util.List;

import com.desafiolatam.model.Student;

public interface StudentDao {

	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);

}
