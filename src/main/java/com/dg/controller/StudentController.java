package com.dg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dg.model.Student;
import com.dg.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	
	@GetMapping(value = "findAllStudent")
	public List<Student> m1() {
		
		return ss.findAllStudent();
		
	}
	
	@GetMapping(value = "findStudentBySid/{id}")
	public Student m2(@PathVariable("id") int sid ) {
		return ss.findStudentBySid(sid);
		
	}
	
	@GetMapping(value = "findeStudentBySnameLike/{sanme}")
	public List<Student> m3(@PathVariable("sanme")String sname){
		return ss.findStudentBySnameLike(sname);
	}
	
	@DeleteMapping(value = "deleteStudentById/{id}")
	public int m4(@PathVariable int id) {
		return ss.deleteStudentBySid(id);
	}
//
//	@GetMapping(value = "greterThanP/{percentage}")
//	public List<Student> m5(@PathVariable("percentage") double p) {
//		return ss.findStudentGT(p);
//	}
//	
	@PostMapping(value = "insertStudent")
	public Student m6( @RequestBody Student s) {
		return ss.insertStudent(s);
	}

	@PutMapping(value = "updateStudentBySid")
	public Student m7( @RequestBody Student s) {
		return ss.insertStudent(s);
	}
	
}
