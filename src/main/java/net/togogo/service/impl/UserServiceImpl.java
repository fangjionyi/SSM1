package net.togogo.service.impl;

import net.togogo.bean.User;
import net.togogo.mapper.UserMapper;
import net.togogo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 方炯翊
 * Date: 2018-09-08
 * Time: 4:07
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
@Override
    public void inertUser(User user){
        userMapper.inertUser(user);

    }
}
