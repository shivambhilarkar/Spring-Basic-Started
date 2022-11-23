package com.example.demo;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.student.Student;


@Repository
@Component
public class StudentService {
	
	private Logger log = Logger.getLogger(StudentService.class.getName());
	 
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public StudentService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate; 
	}
		
	private List<String> studentList = new ArrayList<>();
	
	//method to show homescreen of application
	public String getHomescreen() {
		log.info("Welcome to home screen ");
		return "Welcome to home screen";
	}
	
	//method to return the list of student
	public List<String> getStudentList(){
		log.info("Student List : " + studentList);
		return studentList;
	}

	
	//methode to add new data in h2 database
	public Student addStudent() {
		Student std = new Student("manish","jadhav","mailtomanish@gmail.com",(long) 567298392);
		
		jdbcTemplate.update(
				"insert into STUDENTDATABASE ( fname, lname, email, phone) values (?,?,?,?)",
				std.getFname(),
				std.getLname(),
				std.getEmail(),
				std.getPhoneNO());
		return std;
	}
	
	
	//method to get allStudents from the Database
	public List<Student> getAllStduents() {
		List<Student> lst = jdbcTemplate.query("select * from STUDENTDATABASE" , BeanPropertyRowMapper.newInstance(Student.class));
		
		for(Student std : lst) {
			log.info(std.toString());
		}
		
		return lst;
	}
	
	//Student Row Mapper
	public Student studentRowMapper(ResultSet rs) throws SQLException{
		return new Student(rs.getString("fname"), rs.getString("lname") , rs.getString("email"), 
							rs.getLong("phone"));
	}
	
	
	//method to delete the data from the table where fname = manish
	public void deleteStudent() {
		jdbcTemplate.update( " delete from STUDENTDATABASE where fname = 'manish'");
		log.info("Manish's Data deleted from the database");
	}
	
	
}






