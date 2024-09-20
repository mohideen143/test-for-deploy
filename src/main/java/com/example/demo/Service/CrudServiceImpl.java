package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repo.CrudRepo;

@Service
public class CrudServiceImpl implements CrudService {
	
	@Autowired
	private CrudRepo crudRepo;

	@Override
	public Student addStudent(Student student) {
		
		return crudRepo.save(student);
	}

}
