package com.petclinic.vet;

public class Vet {
	
	private int id;
	private String firstName;
	private String lastName;
	private String img;
	private String email;
	private String password;
	
	public Vet(int id, String firstName, String lastName, String img, String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.img = img;
		this.email = email;
		this.password = password;
	}
	
	public Vet(String firstName, String lastName, String img, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.img = img;
		this.email = email;
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Vet [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", img=" + img + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
	
	
	
	
}
