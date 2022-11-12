package com.GlLab6.CollegeFest.DebateRegistration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GlLab6.CollegeFest.DebateRegistration.Dao.StudentDao;
import com.GlLab6.CollegeFest.DebateRegistration.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentdao;
	public List<Student> getAllStudents(){
		return studentdao.findAll();
	}
}
