package com.CoffeShop.CoffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Persondao {


		@Autowired
		JdbcTemplate jdbcTemplate;
		
	
	 	
		public int addUser(String firstName, String lastName, String email, String phoneNumber, String password) {
			String addQuery =  "Insert into person (firstname, lastname, email, phone, psw) VALUES (?,?,?,?,?)";
			return jdbcTemplate.update(addQuery, firstName, lastName, email, phoneNumber, password );
		}
		
		

	}



