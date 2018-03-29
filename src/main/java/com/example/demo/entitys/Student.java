package com.example.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="fullname")
	private String fullname;
	@Column(name="age")
	private int age;
	@Column(name="address")
	private String address;
	
	
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param id
	 * @param fullname
	 * @param age
	 * @param address
	 */
	public Student(long id, String fullname, int age, String address) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.age = age;
		this.address = address;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}
	/**
	 * @param fullname the fullname to set
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "id: "+getId()+", fullname: "+getFullname()+", Age: "+getAge()+", Address: "+getAddress()+";";
	}
}
