package com.alyss.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	private int student_id;
	private String student_name;
	public String getName() {
		return student_name;
	}
	public void setName(String name) {
		this.student_name = name;
	}
	public int getId() {
		return student_id;
	}
	public void setId(int id) {
		this.student_id = id;
	}
}
