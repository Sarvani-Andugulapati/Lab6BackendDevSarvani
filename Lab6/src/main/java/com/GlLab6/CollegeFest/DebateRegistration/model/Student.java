package com.GlLab6.CollegeFest.DebateRegistration.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

public class Student {
	
private int id;
private String firstname;
private String lastname;
private String course;
private String country;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Student(int id, String firstname, String lastname, String course, String country) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.course = course;
	this.country = country;
}
public Student() {
	
}
@Override
public String toString() {
	return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", course=" + course
			+ ", country=" + country + "]";
}
	
	
}
