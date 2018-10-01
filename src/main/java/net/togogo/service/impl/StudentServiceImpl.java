package net.togogo.service.impl;

import net.togogo.bean.Student;
import net.togogo.mapper.StudentMapper;
import net.togogo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 方炯翊
 * Date: 2018-09-08
 * Time: 2:45
 */
@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    StudentMapper studentMapper;

    @Override
    public void insertStudent(Student student) {
        studentMapper.insertStudent(student);

    }
}
