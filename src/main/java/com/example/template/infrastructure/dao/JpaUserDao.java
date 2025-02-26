package com.example.template.infrastructure.dao;

import org.springframework.stereotype.Component;
import com.example.template.domain.dao.UserDao;
import com.example.template.domain.model.User;
import com.example.template.infrastructure.repository.jpa.UserRepository;
import com.example.template.infrastructure.repository.jpa.mapper.UserEntityMapper;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JpaUserDao implements UserDao {

    private final UserRepository repo;

    private final UserEntityMapper mapper;

    @Override
    public User save(User model) {
        return mapper.toModel(repo.save(mapper.toEntity(model)));
    }

}
