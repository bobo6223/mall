package com.example.mall.controller;

import com.example.mall.dto.UserLoginRequest;
import com.example.mall.dto.UserRegisterRequest;
import com.example.mall.model.ErrorMessage;
import com.example.mall.model.User;
import com.example.mall.service.UserService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Objects;

@RestController
@Slf4j
public class UserController {

    private final UserService userService;
    private Gson gson = new Gson();
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users/register")
    public ResponseEntity<User> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest) {
        Integer userId = userService.register(userRegisterRequest);

        User user = userService.getUserById(userId);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }

    @PostMapping("/users/login")
    public ResponseEntity<User> login(@RequestBody @Valid UserLoginRequest userLoginRequest) {
        User user = userService.login(userLoginRequest);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

//    @PostMapping("/users/login2")
//    public ResponseEntity<String> login2(@RequestBody @Valid UserLoginRequest userLoginRequest,BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            ErrorMessage errorMessage = new ErrorMessage(400, Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
//            return ResponseEntity.badRequest().body(gson.toJson(errorMessage));
//        }
//        User user = userService.login(userLoginRequest);
//
//        return ResponseEntity.status(HttpStatus.OK).body(gson.toJson(user));
//    }
}
