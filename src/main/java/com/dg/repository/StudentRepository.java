package com.dg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dg.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	List<Student> findAll();
	Student findStudnetBySid(int sid);
	
	
	//@Query("delete from student where sid=:a")
	int deleteStudentBySid(int sid);
	
	
	List<Student> findBySnameContains(String sname);
	
	@Query("from Student where spercentage>:a")
	List<Student> findAllStudentGreterthanSpercentage(@Param("a") double p);

//	@Query("select max(spercentage) from Student)")
//	double findByMaxSpercentage();
	
	
	
}
