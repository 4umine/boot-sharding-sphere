package com.somelogs.bootshardingjdbc.service.impl;

import com.somelogs.bootshardingjdbc.entity.User;
import com.somelogs.bootshardingjdbc.mapper.UserDao;
import com.somelogs.bootshardingjdbc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 描述
 *
 * @author LBG - 2019/5/9
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void save(User user) {
        userDao.insert(user);
    }
}
