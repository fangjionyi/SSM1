package net.togogo;

import net.togogo.bean.Student;
import net.togogo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 方炯翊
 * Date: 2018-09-08
 * Time: 3:15
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class StudentTest {

    @Autowired
    StudentService studentService;

    @Test
    public void test1() {


        Student student = new Student(40, "放迥異", "男", 2);

        studentService.insertStudent(student);


    }
}
