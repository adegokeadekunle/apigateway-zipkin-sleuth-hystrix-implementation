package com.adekunle.usersservice.service;

import com.adekunle.usersservice.dto.Department;
import com.adekunle.usersservice.dto.UserDtoResponse;
import com.adekunle.usersservice.dto.UsersDtoRequest;
import com.adekunle.usersservice.models.Users;
import com.adekunle.usersservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final RestTemplate restTemplate;

    @Override
    public Users saveUser(UsersDtoRequest user) {

        return userRepository.save(Users.builder()
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .departmentId(user.getDepartmentId())
                .build()
        );
    }

    @Override
    public UserDtoResponse getUserWithDepartment(Long userId) {

        UserDtoResponse userDto = new UserDtoResponse();
        Users user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        Department department = restTemplate
               // .getForObject("http://localhost:8080/department/getDepartment/"+user.getDepartmentId(),Department.class); hard coding the url
        .getForObject("http://DEPARTMENTS-SERVICE/departments/getDepartment/"+user.getDepartmentId(),Department.class); // using service registry to dynamically create the department service url

        userDto.setUser(user);
        userDto.setDepartment(department);

        return userDto;
    }
}
