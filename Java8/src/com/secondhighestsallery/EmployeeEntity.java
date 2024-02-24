package com.secondhighestsallery;

public class EmployeeEntity {

	int id;
	String name;
	int sallary;
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", sallary=" + sallary + "]";
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
	public int getSallary() {
		return sallary;
	}
	public void setSallary(int sallary) {
		this.sallary = sallary;
	}
	public EmployeeEntity(int id, String name, int sallary) {
		super();
		this.id = id;
		this.name = name;
		this.sallary = sallary;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
