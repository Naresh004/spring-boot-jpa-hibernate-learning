package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdataJpa.CourseSpringDataJpaRepository;

@Component
public class CourseComandLineRunner implements CommandLineRunner{
	
	//@Autowired
	//private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
//		repository.insert(new Course(2,"learn AWS jpa","in28min"));
//		repository.insert(new Course(3,"learn Azure jpanow","in28min"));
//		repository.insert(new Course(4,"learn Devopsjpanow","in28min"));
//		repository.insert(new Course(5,"learn Spring jpa now","in28min"));
//		
//		repository.deleteById(3);
//		System.out.println(repository.slectById(2));
//		
		//above commente code ids for both jdbc,jpa , below is for springdatajpa
		
		repository.save(new Course(2,"learn AWS jpa","in28min"));
		repository.save(new Course(3,"learn Azure jpanow","in28min"));
		repository.save(new Course(4,"learn Devopsjpanow","in28min"));
		repository.save(new Course(5,"learn Spring jpa now","in28min"));
		
		repository.deleteById(3l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("in28min"));
		System.out.println(repository.findByName("learn AWS jpa"));
				
		//save,delteById,findByid are offerd by spring data jpa.
	}

}
