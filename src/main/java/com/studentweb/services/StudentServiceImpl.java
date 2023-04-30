package com.studentweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentweb.entities.Students;
import com.studentweb.repositories.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public void saveStudentInfo(Students student) {
		studentRepo.save(student);

	}

	@Override
	public List<Students> getAllInformationById() {
		List<Students> student = studentRepo.findAll();
		return student;
	}

	@Override
	public void deleteRecordById(long id) {
		studentRepo.deleteById(id);
		
		
		
	}

	@Override
	public Students getStudentById(long id) {
		Optional<Students> findById = studentRepo.findById(id);
		Students student=findById.get();
		return student;
	}

}
