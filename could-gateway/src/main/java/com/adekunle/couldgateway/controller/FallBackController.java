package com.adekunle.couldgateway.controller;

import com.adekunle.couldgateway.service.FallBackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FallBackController {

    private final FallBackService fallBackService;

    @GetMapping("/userServiceFallback")
    public String useServiceFallBack(){
        return fallBackService.userServiceFallback();
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallBack(){
        return fallBackService.departmentServiceFallback();
    }
}
