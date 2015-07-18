package com.channa.controller;

import com.channa.Constants.Constants;
import com.channa.model.Student;
import com.channa.service.StudentService;
import com.channa.service.StudentServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

/**
 * The StudentController class implements basic controller
 * functionalities for Student Management system
 *
 * @author Channa Somathilaka
 * @version 1.0
 * @since 2015-07-17
 */
@Controller
public class StudentController {
    @Autowired
    private StudentServiceDao studentService = new StudentService();

    /**
     * This method is used to
     * get student list.
     *
     * @param model model map for the method
     * @return String Main view
     */
    @RequestMapping(value = "students", method = RequestMethod.GET)
    public String getStudentList(ModelMap model) {
        model.addAttribute(Constants.STUDENT_LIST, studentService.listStudent());
        return Constants.VIEW_MAIN;
    }

    /**
     * This method is used to
     * create a student.
     *
     * @param person  This is the Student that needs to be created
     * @param model model map for the method
     * @return String Students list view
     */
    @RequestMapping(value = "/person/save", method = RequestMethod.POST)
    public View createStudent(@ModelAttribute Student person, ModelMap model) {
        if (StringUtils.hasText(person.getId())) {
            studentService.updateStudent(person);
        } else {
            studentService.addStudent(person);
        }
        return new RedirectView(Constants.VIEW_STUDENTS);
    }

    /**
     * This method is used to
     * delete a student.
     *
     * @param person  This is the Student that needs to be deleted
     * @param model model map for the method
     * @return String Students list view
     */
    @RequestMapping(value = "/student/delete", method = RequestMethod.GET)
    public View deleteStudent(@ModelAttribute Student person, ModelMap model) {
        studentService.deleteStudent(person);
        return new RedirectView(Constants.VIEW_STUDENTS);
    }

    /**
     * This method is used to
     * edit a student.
     *
     * @param person  This is the Student that needs to be edited
     * @param model model map for the method
     * @return String Students list view
     */
    @RequestMapping(value = "/student/edit", method = RequestMethod.POST)
    public View editStudent(@ModelAttribute Student person, ModelMap model) {
        studentService.editStudent(person);
        return new RedirectView(Constants.VIEW_STUDENTS);
    }

    /**
     * This method is used to
     * view a student.
     *
     * @param id  This is the Student that needs to be viewed
     * @param model model map for the method
     * @return String Students list view
     */
    @RequestMapping(value = "/student/view", method = RequestMethod.GET)
    public String viewStudent(@RequestParam("id") String id, ModelMap model) {
        model.addAttribute(Constants.STUDENT, studentService.getStudent(id));
        return Constants.VIEW_STUDENT;
    }

}

