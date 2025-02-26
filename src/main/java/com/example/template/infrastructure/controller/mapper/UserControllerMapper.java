package com.example.template.infrastructure.controller.mapper;

import org.mapstruct.Mapper;
import com.example.template.domain.model.User;
import com.example.template.infrastructure.config.CustomMapperConfig;
import com.example.template.infrastructure.controller.request.UserRequest;
import com.example.template.infrastructure.controller.response.UserResponse;

@Mapper(config = CustomMapperConfig.class)
public interface UserControllerMapper {

    User toModel(UserRequest request);

    UserResponse toResponse(User user);

}
