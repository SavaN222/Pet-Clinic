package com.petclinic.vets;

public class Vet {
	
	private int id;
	private String firstName;
	private String lastName;
	private String img;
	
	public Vet(int id, String firstName, String lastName, String img) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.img = img;
	}
	
	public Vet(String firstName, String lastName, String img) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.img = img;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Vet [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", img=" + img + "]";
	}
	
	
	
	
	
}
