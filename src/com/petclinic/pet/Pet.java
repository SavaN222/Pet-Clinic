package com.petclinic.pet;

public class Pet {

	private int id;
	private String name;
	private String img;
	private int age;
	private int categoryId;
	private String categoryName;
	
	public Pet(int id, String name, String img, int age, int categoryId) {
		this.id = id;
		this.name = name;
		this.img = img;
		this.age = age;
		this.categoryId = categoryId;
	}
	
	public Pet(int id, String name, String img, int age, String categoryName) {
		this.id = id;
		this.name = name;
		this.img = img;
		this.age = age;
		this.categoryName = categoryName;
	}
	
	public Pet(String name, String img, int age, int categoryId) {
		this.name = name;
		this.img = img;
		this.age = age;
		this.categoryId = categoryId;
	}
	
	public Pet(String name, String img, int age, String categoryName) {
		this.name = name;
		this.img = img;
		this.age = age;
		this.categoryName = categoryName;
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", img=" + img + ", age=" + age + ", categoryId=" + categoryId
				+ "]";
	}
	
	
	
}
