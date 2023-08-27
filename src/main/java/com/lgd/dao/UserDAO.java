package com.lgd.dao;

import com.lgd.pojo.User;

public interface UserDAO {
    public int insertUser(User user);
    public User queryUser(String username);

}
