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
 * Created by Chann on 7/18/2015.
 */
@Repository
public class StudentService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public static final String COLLECTION_NAME = "student";

    public void addStudent(Student student) {
        if (!mongoTemplate.collectionExists(Student.class)) {
            mongoTemplate.createCollection(Student.class);
        }
        student.setId(UUID.randomUUID().toString());
        mongoTemplate.insert(student, COLLECTION_NAME);
    }

    public List<Student> listStudent() {
        return mongoTemplate.findAll(Student.class, COLLECTION_NAME);
    }

    public void deleteStudent(Student student) {
        mongoTemplate.remove(student, COLLECTION_NAME);
    }

    public void editStudent(Student student) {

       // mongoTemplate.remove(student, COLLECTION_NAME);
    }


    public void updateStudent(Student student) {
        mongoTemplate.insert(student, COLLECTION_NAME);
    }

    public Student getStudent(String studentId){
        //todo
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(studentId));
        Student student = mongoTemplate.findOne(query, Student.class, COLLECTION_NAME);
        return student;
    }
}
