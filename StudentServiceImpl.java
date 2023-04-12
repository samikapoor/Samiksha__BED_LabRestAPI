package com.gl.CollegeFestDebateSpring.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.CollegeFestDebateSpring.boot.entity.Student;
import com.gl.CollegeFestDebateSpring.boot.repository.StudentRepository;

//Implementation for service interface


@Service
public class StudentServiceImpl/* implements StudentService */ {
	@Autowired
	private StudentRepository studentRepository;
//	private SessionFactory sessionFactory;
//
//	// create session
//	private Session session;

//	@Autowired
//	StudentServiceImpl(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//		try {
//			session = sessionFactory.getCurrentSession();
//		} catch (HibernateException e) {
//			session = sessionFactory.openSession();
//		}
//
//	}

	//provide the list of all students
	
	public List<Student> getAllStudents() {
//		Transaction tx=session.beginTransaction();
//		List<Student> students=session.createQuery("from Student").list();
//		tx.commit();
//		return students;
		return studentRepository.findAll();
	}

	//find the student with the given id
	
	public Optional<Student> findById(int id) {
//		Transaction tx=session.beginTransaction();
//		Student student=session.get(Student.class,id);
//		tx.commit();
//		return student;
		return studentRepository.findById(id);
	}
	//save student data
	
	public Student save(Student student) {
//		Transaction tx=session.beginTransaction();
//		session.save(student);
//		tx.commit();
		return studentRepository.saveAndFlush(student);

	}
	//delete student data
	
	public void delete(Student student) {
//		Transaction tx=session.beginTransaction();
//		session.delete(student);
//		tx.commit();
		studentRepository.delete(student);

	}

}
