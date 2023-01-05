package com.example.Project.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project.entity.Course;

public interface CourseDao extends JpaRepository <Course, Long>{

	List<Course> findAll();

	Course getOne(long courseId);

	 Course save(String course);



	

	
}
