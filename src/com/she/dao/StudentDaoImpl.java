package com.she.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.she.beans.Student;

public class StudentDaoImpl implements IStudentDao {

	private SqlSession session;

	@Override
	public void insertStudent(Student student) {
		
		try {
			// 1.加载主配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			// 2/.创建SqlSessionFactory对象
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
			session = factory.openSession();
			// 4.操作
			session.insert("test.insertStu",student); 
			// 5.提交
			session.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6.关闭
			if(session !=null) {
				session.close();
			}
		}
		
	}

}
