package com.example.template.infrastructure.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.template.infrastructure.repository.jpa.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
