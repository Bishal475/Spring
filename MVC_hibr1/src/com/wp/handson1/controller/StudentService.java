package com.wp.handson1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	public StudentRepo repo;
	
	public void save(Student stud) {
		repo.save(stud);
	}
	
	public List<Student> listAll(){
		return (List<Student>)repo.findAll();
	}
}