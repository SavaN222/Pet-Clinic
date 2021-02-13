package com.petclinic.vet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

public class VetDbUtil {
	
	private DataSource dataSource;

	public VetDbUtil(DataSource dataSource) {
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
	
	/**
	 * Get veterinary who is logged in.
	 * @return Vet
	 */
	public Vet getVet(int id) {
		Vet vet = null;
		String sql = "SELECT * FROM vet WHERE id = ?";
		ResultSet resultSet = null;
		
		try(Connection conn = dataSource.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String img = resultSet.getString("img");
				String email = resultSet.getString("email");
				
				vet = new Vet(id, firstName, lastName, img, email, email);
				return vet;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(null, resultSet);
		}
		return vet;
	}

}
