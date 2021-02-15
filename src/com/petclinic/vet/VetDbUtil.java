package com.petclinic.vet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	
	public void createVet(String firstName, String lastName, String img, String email, String password) {
		String sql = "INSERT INTO vet(first_name, last_name, img, email, password) VALUES(?, ?, ?, ?, ?)";
		
		try(Connection conn = dataSource.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, img);
			stmt.setString(4, email);
			stmt.setString(5, password);
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public List<Vet> getVets () {
		List<Vet> vets = new ArrayList<Vet>();
		ResultSet resultSet = null;
		String sql = "SELECT * FROM vet";
		
		try(Connection conn = dataSource.getConnection(); 
				Statement stmt = conn.createStatement()) {
			
			resultSet = stmt.executeQuery(sql);
			
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String img = resultSet.getString("img");
				String email = resultSet.getString("email");
				
				vets.add(new Vet(id, firstName, lastName, img, email, email));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(null, resultSet);
		}
		return vets;
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

	public void deleteVet(int id) {
		String sql = "DELETE FROM vet WHERE id = ?";
		
		try(Connection conn = dataSource.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setInt(1, id);
			stmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int numOfPets() {
		String sql = "SELECT count(id) as numOfPets FROM pet";
		ResultSet resultSet = null;
		int numOfPets = 0;
		
		try(Connection conn = dataSource.getConnection();
				Statement stmt = conn.createStatement()) {
			
			resultSet = stmt.executeQuery(sql);
			
			while (resultSet.next()) {
				numOfPets = resultSet.getInt("numOfPets");
			}
			return numOfPets;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(null, resultSet);
		}
		return numOfPets;

	}
	
	public int numOfRecords() {
		String sql = "SELECT count(id) as numOfRecords FROM record";
		ResultSet resultSet = null;
		int numOfRecords = 0;
		
		try(Connection conn = dataSource.getConnection();
				Statement stmt = conn.createStatement()) {
			
			resultSet = stmt.executeQuery(sql);
			
			while (resultSet.next()) {
				numOfRecords = resultSet.getInt("numOfRecords");
			}
			return numOfRecords;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(null, resultSet);
		}
		return numOfRecords;

	}

	public void updateVet(int id, String firstName, String lastName, String email, String password) {
		String sql = "UPDATE vet SET first_name = ?, last_Name = ?, email = ?, password = ?"
				+ " WHERE id = ?";
		
		ResultSet resultSet = null;
		
		try(Connection conn = dataSource.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, email);
			stmt.setString(4, password);
			stmt.setInt(5, id);
			
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
