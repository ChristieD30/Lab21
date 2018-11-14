package com.CoffeShop.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ItemsJDBCDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Items> findAllItems(){
		return jdbcTemplate.query("Select * From items", new BeanPropertyRowMapper<Items>(Items.class));
		
		
	}
	
	public List<Items> findByCategory(String brand){
		return jdbcTemplate.query("Select * From items WHERE brand like '%" + brand + "%'", new BeanPropertyRowMapper<Items>(Items.class));
		
	}

}
