package com.dg;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dg.model.Student;
import com.dg.service.StudentService;

@SpringBootApplication
public class DgApplication {
	

	public static void main(String[] args) {
		
		ApplicationContext context=
		SpringApplication.run(DgApplication.class, args);
	//Insert student task
		/*
		StudentService ss=	context.getBean(StudentService.class);
 
	int n=0;

	if(n>0) {
	Student s=new Student();
						//Enter Student Name
	s.setSname("");
						//Enter Student City 
	s.setScity("");
						//Enter Student Percentage
	s.setSpercentage(0);
	
	if(ss.insertStudent(s)!=null) {
		System.out.println("Insert Successfully ");

	}
	}
	*/
	//System.out.println(ss.deleteStudentBySid(13));
	
	}

}
