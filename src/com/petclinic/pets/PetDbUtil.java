package com.petclinic.pets;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class PetDbUtil {

	private DataSource dataSource;
	private Connection conn;
	
	public PetDbUtil (DataSource dataSource) {
		this.dataSource = dataSource;
		
		try {
			conn = this.dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	private void closeConnection() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Pet> getPets() throws Exception {
		List<Pet> pets = new ArrayList<Pet>();
		
		String sql = "SELECT * FROM pet";
		
		try(Statement stmt = conn.createStatement();
				ResultSet resultSet = stmt.executeQuery(sql)) {
		
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String img = resultSet.getString("img");
				int age = resultSet.getInt("age");
				int category_id = resultSet.getInt("category_id");
				
				pets.add(new Pet(id, name, img, age, category_id));
			}
		} finally {
			closeConnection();
		} 
		
		return pets;
		
	}
	
}
