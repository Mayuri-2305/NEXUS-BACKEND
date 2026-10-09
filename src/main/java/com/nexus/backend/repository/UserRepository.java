package com.nexus.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexus.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}