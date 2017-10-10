package com.example.shiro01.repository;

import com.example.shiro01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    /** 通过username查找用户 */
    public User findByUsername(String username);
}
