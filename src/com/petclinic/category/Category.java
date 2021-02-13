package com.petclinic.category;

public class Category {
	
	private int id;
	private String nameString;
	
	public Category(int id, String nameString) {
		this.id = id;
		this.nameString = nameString;
	}
	
	public Category(String nameString) {
		this.nameString = nameString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", nameString=" + nameString + "]";
	}
	
	

	
}
