package com.example.mall.dao;

import com.example.mall.dto.UserRegisterRequest;
import com.example.mall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
