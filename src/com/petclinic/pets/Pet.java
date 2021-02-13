package com.petclinic.pets;

public class Pet {
	
	private int id;
	private String name;
	private String img;
	private int age;
	private int category_id;
	
	
	public Pet(int id, String name, String img, int age, int category_id) {
		this.id = id;
		this.name = name;
		this.img = img;
		this.age = age;
		this.category_id = category_id;
	}



	public Pet(String name, String img, int age, int category_id) {
		this.name = name;
		this.img = img;
		this.age = age;
		this.category_id = category_id;
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

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", img=" + img + ", age=" + age + ", category_id=" + category_id
				+ "]";
	}
	
}