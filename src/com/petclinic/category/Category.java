package com.petclinic.category;

public class Category {
	
	private int id;
	private String name;
	
	public Category(int id, String nameString) {
		this.id = id;
		this.name = nameString;
	}
	
	public Category(String nameString) {
		this.name = nameString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", nameString=" + name + "]";
	}
	
	

	
}
