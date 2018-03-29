/**
 * 
 */
package com.example.demo.daos;

import java.util.List;

import com.example.demo.entitys.Student;

/**
 * @author HP
 *
 */
public interface StudentDAO {
	public Student getStudentById(long id);
	public List<Student> getAllStudent();
	public void addNewStudent(Student student);
	public void deleteAStudent(long id);
	public void updateStudent(Student student);
}
