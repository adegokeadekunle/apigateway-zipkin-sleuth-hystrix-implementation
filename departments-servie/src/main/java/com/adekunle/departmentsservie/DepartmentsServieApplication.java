package com.adekunle.departmentsservie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentsServieApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentsServieApplication.class, args);
    }

}
