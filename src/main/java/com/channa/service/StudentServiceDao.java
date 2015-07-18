package com.channa.service;

import com.channa.model.Student;

import java.util.List;

/**
 * Created by Chann on 7/18/2015.
 */
public interface StudentServiceDao {

    public void addStudent(Student student);
    public List<Student> listStudent();
    public void deleteStudent(Student student);
    public void editStudent(Student student);
    public void updateStudent(Student student);
    public Student getStudent(String studentId);
}
