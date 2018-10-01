package net.togogo.mapper;

import net.togogo.bean.Student;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 方炯翊
 * Date: 2018-09-08
 * Time: 2:38
 */
@Repository
public interface StudentMapper {

     void insertStudent(Student student);
}
