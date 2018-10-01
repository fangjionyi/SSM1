package net.togogo.controller;

import net.togogo.bean.Student;
import net.togogo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 方炯翊
 * Date: 2018-09-08
 * Time: 2:47
 */
@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insertStudent(Student student) {


        studentService.insertStudent(student);
        return "/index.jsp";
    }

}
