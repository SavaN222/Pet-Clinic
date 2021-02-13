package com.petclinic.pets;

import java.sql.Connection;

import javax.sql.DataSource;

public class PetDbUtil {

	private DataSource dataSource;
	private Connection conn;
	
	public PetDbUtil (DataSource dataSource) {
		this.dataSource = dataSource;
		
		try {
			conn = dataSource.getConnection();
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
	
}
