package com.curtain.service.impl;

import com.curtain.dao.UserMapper;
import com.curtain.entity.User;
import com.curtain.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(String id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
