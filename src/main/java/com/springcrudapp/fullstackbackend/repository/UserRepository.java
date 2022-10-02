package com.springcrudapp.fullstackbackend.repository;

import com.springcrudapp.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
