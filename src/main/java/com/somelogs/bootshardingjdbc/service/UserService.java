package com.somelogs.bootshardingjdbc.service;

import com.somelogs.bootshardingjdbc.entity.User;

/**
 * 描述
 *
 * @author LBG - 2019/5/9
 */
public interface UserService {

    User getById(Long id);

    void update(User user);

    void save(User user);
}
