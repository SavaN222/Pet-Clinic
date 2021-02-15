package com.petclinic.record;

/**
 * Medical Records
 *
 */
public class Record {
	private int id;
	private String title;
	private String description;
	private String date;
	private int petId;
	private int vetId;
	private String vetName;
	
	public Record(int id, String title, String description, String date, int petId, String vetName) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.date = date;
		this.petId = petId;
		this.vetName = vetName;
	}
	
	public Record(String title, String description, String date, int petId, int vetId) {
		this.title = title;
		this.description = description;
		this.date = date;
		this.petId = petId;
		this.vetName = vetName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public String getVetName() {
		return vetName;
	}

	public void setVetName(String vetName) {
		this.vetName = vetName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getVetId() {
		return vetId;
	}

	public void setVetId(int vetId) {
		this.vetId = vetId;
	}

	@Override
	public String toString() {
		return "Records [id=" + id + ", title=" + title + ", description=" + description + ", date=" + date + ", petId="
				+ petId + ", vetId=" + vetId + "]";
	}
	
	
	
	

}
