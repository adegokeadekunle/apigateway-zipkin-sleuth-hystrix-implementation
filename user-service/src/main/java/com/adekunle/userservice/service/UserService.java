package com.adekunle.userservice.service;

import com.adekunle.userservice.dto.UserDtoResponse;
import com.adekunle.userservice.dto.UsersDtoRequest;
import com.adekunle.userservice.models.Users;

public interface UserService {
    Users saveUser(UsersDtoRequest user);

    UserDtoResponse getUserWithDepartment(Long userId);
}
