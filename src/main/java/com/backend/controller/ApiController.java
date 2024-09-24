package com.backend.controller;

import com.backend.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/backend")
public class ApiController {

    private final ApiService apiService;
    @GetMapping("/service")
    public void getApiService() {
        apiService.getApi();
    }
}
