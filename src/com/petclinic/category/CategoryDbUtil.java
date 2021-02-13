package com.petclinic.category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class CategoryDbUtil {
	
	private DataSource dataSource;
	
	public CategoryDbUtil(DataSource dataSource) {
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
	
	public void createCategory(String name) {
		String sql = "INSERT INTO category(name) VALUES(?)";
		
		try(Connection conn = dataSource.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, name);
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Category> listCategories() {
		List<Category> categories = new ArrayList<Category>();
		String sql = "SELECT * FROM category";
		ResultSet resultSet = null;
		
		try(Connection conn = dataSource.getConnection();
				Statement stmt = conn.createStatement()) {
			resultSet = stmt.executeQuery(sql);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				categories.add(new Category(id, name));
			}
			return categories;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(null, resultSet);
		}
		return categories;
	}
}
