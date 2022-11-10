package com.GlLab6.CollegeFest.DebateRegistration.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@EntityScan
@JsonPOJOBuilder
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String Department;
private String Country;
	
}
