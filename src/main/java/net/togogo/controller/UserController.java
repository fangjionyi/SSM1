package net.togogo.controller;

import net.togogo.bean.User;
import net.togogo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 方炯翊
 * Date: 2018-09-08
 * Time: 4:10
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

@RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insert(User user){
    userService.inertUser(user);
        return "/index.jsp";
    }

}
