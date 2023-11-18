package com.demo.wearway.repository;

import com.demo.wearway.entity.OrderTotal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderTotal, Long> {



}
