package com.susha.prac.sampapp.repository;

import com.susha.prac.sampapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
