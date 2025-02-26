package com.example.template.application.service;

import org.springframework.stereotype.Service;
import com.example.template.domain.dao.UserDao;
import com.example.template.domain.model.User;
import com.example.template.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService  {

    private final UserDao dao;

    @Override
    public User save(User model) {
        return dao.save(model);
    }

}
