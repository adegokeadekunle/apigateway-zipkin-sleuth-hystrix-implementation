package com.adekunle.usersservice.dto;


import com.adekunle.usersservice.models.Users;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDtoResponse {

    private Users user;
    private Department department;

}
