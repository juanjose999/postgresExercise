package com.exercise.Ada.repository;

import com.exercise.Ada.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorJpa extends JpaRepository<User, Long> {
}
