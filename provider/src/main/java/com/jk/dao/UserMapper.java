package com.jk.dao;

import com.jk.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends JpaRepository<User , Integer> {
}
