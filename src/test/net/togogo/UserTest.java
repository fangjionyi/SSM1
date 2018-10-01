package net.togogo;

import net.togogo.bean.User;
import net.togogo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.ws.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 方炯翊
 * Date: 2018-09-08
 * Time: 4:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class UserTest {

    @Autowired
    UserService userService;

    @Test
    public void test1(){
        User user=new User(57,"放fan","3245");
        userService.inertUser(user);

    }
}
