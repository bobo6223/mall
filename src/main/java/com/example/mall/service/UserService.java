package com.example.mall.service;

import com.example.mall.dto.UserLoginRequest;
import com.example.mall.dto.UserRegisterRequest;
import com.example.mall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);

}
