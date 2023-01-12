package com.adekunle.usersservice.service;

import com.adekunle.usersservice.dto.UserDtoResponse;
import com.adekunle.usersservice.dto.UsersDtoRequest;
import com.adekunle.usersservice.models.Users;

public interface UserService {
    Users saveUser(UsersDtoRequest user);

    UserDtoResponse getUserWithDepartment(Long userId);
}
