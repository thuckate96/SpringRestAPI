package com.example.demo.controllers;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody; 
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daos.StudentDAO;
import com.example.demo.entitys.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentDAO studentService;
	@RequestMapping("/student")
	public Student findStudentById(@RequestParam("id") long id) {
		System.out.println("this is id: " +id); 
		return  studentService.getStudentById(id);
	}
	
	@RequestMapping("/students")
	public List<Student> getAllStudent(){
		
		return studentService.getAllStudent();
	}
	
	@RequestMapping(value="/addStudent", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody 
	public boolean addStudent(@RequestBody Student student) { 
		studentService.addNewStudent(student);
		System.out.println("Successfully");
		return true;
	}
	
	@RequestMapping(value="/updateStudent", method=RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean updateStudent(@RequestBody Student student ) {
		
		studentService.updateStudent(student);
		return true;
	}
	
	@RequestMapping(value="/deleteStudent", method=RequestMethod.DELETE)
	
	public boolean deleteStudent(@RequestParam("id") long id) {
		System.out.println(id);
		studentService.deleteAStudent(id);
		return true;
	}
}
