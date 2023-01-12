package com.adekunle.usersservice.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersDtoRequest {
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;
}
