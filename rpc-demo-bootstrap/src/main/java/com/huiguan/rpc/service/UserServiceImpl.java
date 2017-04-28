package com.huiguan.rpc.service;

import com.huiguan.rpc.api.entity.User;
import com.huiguan.rpc.api.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by ansoya on 2017/4/27.
 */
@Service
public class UserServiceImpl implements UserService {

    public User getUser(User userParameter){
        User user=new User();
        user.setName(userParameter.getName());
        return user;
    }
}
