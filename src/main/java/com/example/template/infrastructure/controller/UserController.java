package com.example.template.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.template.domain.service.UserService;
import com.example.template.infrastructure.controller.mapper.UserControllerMapper;
import com.example.template.infrastructure.controller.request.UserRequest;
import com.example.template.infrastructure.controller.response.UserResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/weather")
public class UserController {

    private final UserService service;

    private final UserControllerMapper mapper;

    @PostMapping("/{stationCode}")
    public ResponseEntity<UserResponse> save(@PathVariable String stationCode,
            @RequestBody @Validated UserRequest request) {
        return ResponseEntity.ok()
                .body(mapper.toResponse(service.save(mapper.toModel(request))));
    }

}
