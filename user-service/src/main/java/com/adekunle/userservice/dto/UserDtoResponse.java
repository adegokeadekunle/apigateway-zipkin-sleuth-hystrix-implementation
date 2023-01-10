package com.adekunle.userservice.dto;

import com.adekunle.userservice.models.Users;
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
