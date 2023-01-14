package com.adekunle.couldgateway.service;

import org.springframework.stereotype.Service;

@Service
public class FallBackServiceImpl implements FallBackService{
    @Override
    public String userServiceFallback() {
        return "User Service is taking longer than expected, please try again later.";
    }

    @Override
    public String departmentServiceFallback() {
       return "Department Service is taking longer than expected, please try again later.";
    }
}
