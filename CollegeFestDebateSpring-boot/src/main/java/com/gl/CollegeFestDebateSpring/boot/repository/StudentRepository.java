package com.gl.CollegeFestDebateSpring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.CollegeFestDebateSpring.boot.entity.Student;

//service layer interface
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
//	public List<Student> getAllStudents();
//	public Student findById(int id);
//	public void save(Student student);
//	public void delete(Student student);
	
}
