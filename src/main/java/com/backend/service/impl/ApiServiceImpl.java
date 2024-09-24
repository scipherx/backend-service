package com.backend.service.impl;

import com.backend.service.ApiService;
import lombok.extern.slf4j.Slf4j;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {
    @Override
    public void getApi() {
        log.info("Success response");
    }
}
