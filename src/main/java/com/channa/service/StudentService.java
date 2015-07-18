package com.channa.service;

import com.channa.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * The StudentService class implements basic
 * functionalities for retrieve students from database
 *
 * @author Channa Somathilaka
 * @version 1.0
 * @since 2015-07-17
 */
@Repository
public class StudentService implements StudentServiceDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public static final String COLLECTION_NAME = "student";

    /**
     * This method is used to
     * create a student.
     *
     * @param student This is the Student that needs to be created
     */
    public void addStudent(Student student) {
        if (!mongoTemplate.collectionExists(Student.class)) {
            mongoTemplate.createCollection(Student.class);
        }
        student.setId(UUID.randomUUID().toString());
        mongoTemplate.insert(student, COLLECTION_NAME);
    }

    /**
     * This method is used to
     * get student list.
     *
     * @return List of students
     */
    public List<Student> listStudent() {
        return mongoTemplate.findAll(Student.class, COLLECTION_NAME);
    }

    /**
     * This method is used to
     * delete a student.
     *
     * @param student This is the Student that needs to be deleted
     */
    public void deleteStudent(Student student) {
        mongoTemplate.remove(student, COLLECTION_NAME);
    }

    /**
     * This method is used to
     * edit a student.
     *
     * @param student This is the Student that needs to be edited
     */
    public void editStudent(Student student) {
        mongoTemplate.save(student, COLLECTION_NAME);
    }

    /**
     * This method is used to
     * edit a student.
     *
     * @param student This is the Student that needs to be edited
     */
    public void updateStudent(Student student) {
        mongoTemplate.insert(student, COLLECTION_NAME);
    }

    /**
     * This method is used to
     * view a student.
     *
     * @param studentId This is the Student id that needs to be viewed
     */
    public Student getStudent(String studentId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(studentId));
        Student student = mongoTemplate.findOne(query, Student.class, COLLECTION_NAME);
        return student;
    }
}
