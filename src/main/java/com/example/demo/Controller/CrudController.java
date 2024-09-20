package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.CrudService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class CrudController {
	
	@Autowired
	private CrudService crudService;
	
	@PostMapping("crud/add")
	public Student addStudent(@RequestBody Student student) {
	   Student id = crudService.addStudent(student);
	   return id;
	}

}
