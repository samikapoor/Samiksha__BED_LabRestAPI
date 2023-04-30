package com.studentweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentweb.entities.Students;

public interface StudentRepository extends JpaRepository<Students, Long> {

}
