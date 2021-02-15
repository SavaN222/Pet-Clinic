package com.petclinic.record;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import java.util.ArrayList;
import java.util.List;

public class RecordDbUtil {

	private DataSource dataSource;
	
	public RecordDbUtil(DataSource dataSource) {
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
	
	public void createRecords(String title, String description, int petId, int vetId) {
		String sql = "INSERT INTO record(title, description, pet_id, vet_id) VALUES(?, ?, ?, ?)";
		
		try(Connection conn = dataSource.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, title);
			stmt.setString(2, description);
			stmt.setInt(3, petId);
			stmt.setInt(4, vetId);
			
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Get all medical records for pet pacient
	 * @param petId
	 */
	public List<Record> getRecordsForPet(int petId) {
		
		String sql = "SELECT r.id, r.title, r.description, r.visited_at, r.pet_id, v.first_name, v.last_name"
				+ " FROM record r LEFT JOIN vet v ON r.vet_id = v.id WHERE pet_id = ?";
		ResultSet resultSet = null;
		List<Record> medicalRecords = new ArrayList<Record>();
		
		try(Connection conn = dataSource.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setInt(1, petId);
			
			resultSet = stmt.executeQuery();
			
			while (resultSet.next()) {
				int id = resultSet.getInt("r.id");
				String title = resultSet.getString("r.title");
				String description = resultSet.getString("r.description");
				String date = resultSet.getString("r.visited_at");
				String vetFirstName = resultSet.getString("v.first_name");
				String vetLastName = resultSet.getString("v.last_name");
				String vetName = vetFirstName + " " + vetLastName;
				
				Record record = new Record(id, title, description, date, petId, vetName);
				
				medicalRecords.add(record);
			}
			return medicalRecords;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(null, resultSet);
		}
		
		return medicalRecords;
	}

}
