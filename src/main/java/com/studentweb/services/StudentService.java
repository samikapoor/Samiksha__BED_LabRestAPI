package com.studentweb.services;

import java.util.List;

import com.studentweb.entities.Students;

public interface StudentService {
	
	public void saveStudentInfo(Students student);

	public List<Students> getAllInformationById();

	void deleteRecordById(long id);

	public Students getStudentById(long id);

}
