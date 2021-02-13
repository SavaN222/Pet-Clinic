package com.petclinic.pet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class PetDbUtil {
	
	private DataSource dataSource;
	
	public PetDbUtil(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private void closeConnection(Connection conn, ResultSet resultSet) {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Pet> getPets() {
		List<Pet> pets = new ArrayList<Pet>();
		ResultSet resultSet = null;
		String sql = "SELECT p.id, p.name, p.img, p.age, c.name FROM pet p"
				+ " LEFT JOIN category c ON p.id = c.id";
		
		try(Connection conn = dataSource.getConnection();
				Statement stmt = conn.createStatement()) {
			
			resultSet = stmt.executeQuery(sql);
			while (resultSet.next()) {
				int id = resultSet.getInt("p.id");
				String name = resultSet.getString("p.name");
				String img = resultSet.getString("p.img");
				int age = resultSet.getInt("p.age");
				String categoryName = resultSet.getString("c.name");
				
				pets.add(new Pet(id, name, img, age, categoryName));
			}
			return pets;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(null, resultSet);
		}
		return pets;
	}
	
	public void createPets(String name, String img, int age, int categoryId) {
		String sql = "INSERT INTO pet(name, img, age, category_Id) VALUES(?, ?, ?, ?)";
		try(Connection conn = dataSource.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, name);
			stmt.setString(2, img);
			stmt.setInt(3, age);
			stmt.setInt(4, categoryId);
			
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deletePet(int id) {
		String sql = "DELETE FROM pet WHERE id = ?";
		
		try(Connection conn = dataSource.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setInt(1, id);
			stmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
