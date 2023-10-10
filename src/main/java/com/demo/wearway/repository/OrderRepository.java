package com.demo.wearway.repository;

import com.demo.wearway.entity.OrderTotal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderTotal, Long> {

}
