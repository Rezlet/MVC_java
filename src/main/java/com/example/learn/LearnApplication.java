package com.example.learn;

import java.util.List;

import com.example.learn.model.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class LearnApplication  {


	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String sql = "SELECT * FROM customers";
//		List<Customer> customers = jdbcTemplate
//				.query(sql,
//				BeanPropertyRowMapper.newInstance(Customer.class));
//
//		customers.forEach(System.out :: println);
//	}

}
