package com.petclinic.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import javax.sql.DataSource;

public class LoginDbUtil {
	private DataSource dataSource;

	public LoginDbUtil(DataSource dataSource) {
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
	
	public int login(String email, String password) {
		String sql = "SELECT id FROM vet WHERE email = ? AND password = ?";
		int id = -1;
		ResultSet resultSet = null;
		try(Connection conn = dataSource.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, email);
			stmt.setString(2, password);
			
			resultSet = stmt.executeQuery();
			
			while(resultSet.next()) {
				id = resultSet.getInt("id");
				return id;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(null, resultSet);
		}
		return id;
	}
}
