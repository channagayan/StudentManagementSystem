package com.channa.controller;

import com.channa.model.Student;
import com.channa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;
/**
 * Created by Chann on 7/18/2015.
 * test comment
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "students", method = RequestMethod.GET)
    public String getStudentList(ModelMap model) {
        model.addAttribute("studentList", studentService.listStudent());
        return "output";
    }

    @RequestMapping(value = "/person/save", method = RequestMethod.POST)
    public View createStudent(@ModelAttribute Student person, ModelMap model) {
        if(StringUtils.hasText(person.getId())) {
            studentService.updateStudent(person);
        } else {
            studentService.addStudent(person);
        }
        return new RedirectView("/cinglevue/students");
    }

    @RequestMapping(value = "/student/delete", method = RequestMethod.GET)
    public View deleteStudent(@ModelAttribute Student person, ModelMap model) {
        studentService.deleteStudent(person);
        return new RedirectView("/cinglevue/students");
    }

    @RequestMapping(value = "/student/edit", method = RequestMethod.GET)
    public View editStudent(@ModelAttribute Student person, ModelMap model) {
        studentService.editStudent(person);
        return new RedirectView("/cinglevue/students");
    }

    @RequestMapping(value = "/student/view", method = RequestMethod.GET)
    public void viewStudent(@ModelAttribute Student student, ModelMap model) {
        studentService.getStudent(student.getId());
        //return new RedirectView("/cinglevue/students");
    }
}

