package com.jbk.student.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.student.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveStudent(Student student) {
		Session session = null;
		Transaction transaction = null;
		boolean isAdded = false;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Student students = session.get(Student.class, student.getStudentId());
			if (students == null) {
				session.save(student);
				transaction.commit();
				isAdded = true;
				System.out.println(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();

			}
		}

		return isAdded;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = null;
		Session session = null;

		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Student.class);
			list = criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null)
			session.close();
		}
		return list;
	}

	@Override
	public boolean deleteStudent(int studentId) {
		Session session = null;
		Transaction transaction = null; // save, update,delete
		boolean isDeleted = false;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Student student = session.get(Student.class, studentId);

			session.delete(student);
			transaction.commit();
			isDeleted = true;
			System.out.println(student);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null)
			session.close();
		}
		return isDeleted;
	}

	@Override
	public boolean updateStudent(Student student) {
		Session session = null;
		Transaction transaction = null; // save, update,delete
		boolean isUpdated = false;
		try {
			session = sessionFactory.openSession();

			transaction = session.beginTransaction();
			Student student1 = session.get(Student.class, student.getStudentId());
			if (student1 != null) {
				session.evict(student1);
				session.update(student);
				transaction.commit();
				isUpdated = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isUpdated;
	}

}
