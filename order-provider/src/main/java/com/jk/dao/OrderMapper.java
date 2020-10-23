package com.jk.dao;

import com.jk.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper extends JpaRepository<Order, Integer> {
}
