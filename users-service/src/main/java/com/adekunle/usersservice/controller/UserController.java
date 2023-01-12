package com.adekunle.usersservice.controller;

import com.adekunle.usersservice.dto.UserDtoResponse;
import com.adekunle.usersservice.dto.UsersDtoRequest;
import com.adekunle.usersservice.models.Users;
import com.adekunle.usersservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j

public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    public Users saveUser(@RequestBody UsersDtoRequest user){

        log.info("User service creating new user : {} {}",user.getFirstName(),user.getLastName());
        return userService.saveUser(user);
    }

    @GetMapping("/getDepartmentByUserId/{userId}")
    public UserDtoResponse getUserWithDepartment(@PathVariable("userId") Long userId){
        log.info("getting user department from user id : {}",userId);
        return userService.getUserWithDepartment(userId);

    }
}
