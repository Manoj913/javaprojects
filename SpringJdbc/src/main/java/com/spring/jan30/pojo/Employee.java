package com.spring.jan30.pojo;

public class Employee {
	private Integer ID;
	private String firtsName;
	private String lastName;
	private Integer salary;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", firtsName=" + firtsName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	public Employee(Integer iD, String firtsName, String lastName, Integer salary) {
		ID = iD;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public Employee(){
		
	}
	
}
