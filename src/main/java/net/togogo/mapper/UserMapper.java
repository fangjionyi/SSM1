package net.togogo.mapper;

import net.togogo.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 方炯翊
 * Date: 2018-09-08
 * Time: 3:57
 */
@Repository
public interface UserMapper {

    public void inertUser(User user);
}
