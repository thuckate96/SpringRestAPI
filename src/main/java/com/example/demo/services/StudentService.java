package com.example.demo.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository; 
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.daos.StudentDAO;
import com.example.demo.entitys.Student;
@Transactional
@Repository
public class StudentService implements StudentDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Student getStudentById(long id) {
		String sql = " from Student  where id = "+id+" ";
		List<Student> student = entityManager.createQuery(sql, Student.class).getResultList();
		return student.get(0);
	}
	
	@Override
	public List<Student> getAllStudent() {
		String sql = "select s from Student s ";
		List<Student> listStudent = entityManager.createQuery(sql, Student.class).getResultList();
		return listStudent;
	}

	@Override
	public void addNewStudent(Student student) { 
		entityManager.persist(student); 
	}

	@Override
	public void deleteAStudent(long id) {
		
		String sql = "Delete Student where id =:id ";
		System.out.println(sql);
		entityManager.createQuery(sql).setParameter("id", id).executeUpdate();
	}

	@Override
	public void updateStudent(Student student) {
		
		entityManager.merge(student);
	}

}
