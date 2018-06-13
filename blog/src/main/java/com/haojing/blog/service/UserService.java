package com.haojing.blog.service;

import com.haojing.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
