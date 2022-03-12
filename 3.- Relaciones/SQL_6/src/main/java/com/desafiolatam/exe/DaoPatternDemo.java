package com.desafiolatam.exe;

import com.desafiolatam.dao.StudentDao;
import com.desafiolatam.dao.StudentDaoImpl;
import com.desafiolatam.model.Student;

public class DaoPatternDemo {

	public void exe() {

		// Implementacion Dao
		StudentDao studentDao = new StudentDaoImpl();

		// Mostrar Estudiantes
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		System.out.println("---------------------");

		// ctualizar Estudiante
		Student student = studentDao.getAllStudents().get(0);
		student.setName("David");
		studentDao.updateStudent(student);

		System.out.println("---------------------");

		// Obtener Estudiante
		studentDao.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");

		System.out.println("---------------------");

		// Mostrar Estudiantes
		for (Student student2 : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student2.getRollNo() + ", Name : " + student2.getName() + " ]");
		}

	}
}
