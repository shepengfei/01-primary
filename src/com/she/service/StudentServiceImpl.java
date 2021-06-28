package com.she.service;

import com.she.beans.Student;
import com.she.dao.IStudentDao;
import com.she.dao.StudentDaoImpl;

public class StudentServiceImpl implements IStudentService{
	
	IStudentDao studentDao = new StudentDaoImpl();
	
	@Override
	public void addStudent(Student student) {
		
		studentDao.insertStudent(student);
	}
	

}
