package com.GlLab6.CollegeFest.DebateRegistration.Dao;

import java.util.List;

import com.GlLab6.CollegeFest.DebateRegistration.model.Student;

public interface StudentDao {
	
	public List<Student> findAll();
	
	public void save(Student student);
	
	public void saveorUpdate(Student student);
	
	public void deleteStudent(int id);

	public Student findByid(int id);

}
