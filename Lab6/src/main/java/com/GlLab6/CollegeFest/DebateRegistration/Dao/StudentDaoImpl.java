package com.GlLab6.CollegeFest.DebateRegistration.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.GlLab6.CollegeFest.DebateRegistration.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	EntityManager entitymanager;
	
	@Override
	@Transactional
	public List<Student> findAll() {
		Session currentSession = entitymanager.unwrap(Session.class);
		
		Query query = currentSession.createQuery("from Student");
		
		List<Student> students = query.getResultList();
		return students;
	}

	@Override
	@Transactional
	public void save(Student student) {
			Session currentSession = entitymanager.unwrap(Session.class);
			currentSession.save(currentSession);

	}

	@Override
	public void saveorUpdate(Student student) {
		Session currentSession = entitymanager.unwrap(Session.class);
		currentSession.update(currentSession);

	}

	@Override
	public void deleteStudent(int id) {
		Session currentSession = entitymanager.unwrap(Session.class);
		currentSession.delete(currentSession);

	}

	@Override
	public Student findByid(int id) {
		
		return null;
	}

}
