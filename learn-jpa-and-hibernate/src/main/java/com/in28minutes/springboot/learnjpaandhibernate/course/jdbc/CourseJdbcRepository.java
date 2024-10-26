package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	private static String INSERT_QUERY =
//			"""
//			insert into course(id,name,author)
//			values(2,'learn Spring','in28min');
//			""";
			"""
			insert into course(id,name,author)
			values(?,?,?);
			""";
	
	private static String DeleteQuery =
			"""
			delete from course
			where id =?
			""";
	
	private static String SelectQuery =
			"""
			select * from course
			where id =?
			""";
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(),course.getName(),course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DeleteQuery,id);
	}
	public Course slectById(long id) {
		return springJdbcTemplate.queryForObject(SelectQuery,
				new BeanPropertyRowMapper<>(Course.class),id);
		
		//resultset ->bean = rowmapper
	}
	
	

}
