package com.she.test;

import com.she.beans.Student;
import com.she.service.IStudentService;
import com.she.service.StudentServiceImpl;

public class MyView {

	public static void main(String[] args) {
		IStudentService studentServiceImpl = new StudentServiceImpl();
		Student student = new Student("张三",12);
		studentServiceImpl.addStudent(student);

	}

}
