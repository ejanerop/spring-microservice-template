package com.example.template.infrastructure.repository.jpa.mapper;

import org.mapstruct.Mapper;
import com.example.template.domain.model.User;
import com.example.template.infrastructure.config.CustomMapperConfig;
import com.example.template.infrastructure.repository.jpa.entity.UserEntity;

@Mapper(config = CustomMapperConfig.class)
public interface UserEntityMapper {

    User toModel(UserEntity entity);

    UserEntity toEntity(User model);

}
