package com.somelogs.bootshardingjdbc.mapper;

import com.somelogs.bootshardingjdbc.entity.User;

/**
 * 描述
 *
 * @author LBG - 2019/5/9
 */
public interface UserDao {

    User getById(Long id);

    void insert(User user);

    void update(User user);
}
