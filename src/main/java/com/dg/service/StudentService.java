package com.dg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dg.model.Student;
import com.dg.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository sr;
	
	public List<Student> findAllStudent(){
		return sr.findAll();
	}
	
	public Student findStudentBySid(int sid) {
		return sr.findStudnetBySid(sid);
	}
	
	public List<Student> findStudentBySnameLike(String sname){
		return sr.findBySnameContains(sname);
	}
	
	public int deleteStudentBySid(int sid) {
		return sr.deleteStudentBySid(sid);
		
	}
	public Student insertStudent(Student s) {
		
		return sr.save(s);
	}
	
	public List<Student> findStudentGT(double spercentage){
		return sr.findAllStudentGreterthanSpercentage(spercentage);
	}
	
	public Student updateStudent(Student s) {
		
		return sr.save(s);
	}

}
