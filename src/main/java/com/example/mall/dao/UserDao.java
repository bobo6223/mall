package com.example.mall.dao;

import com.example.mall.dto.UserRegisterRequest;
import com.example.mall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
