package com.helixz.spring.batch.demo.repository;

import com.helixz.spring.batch.demo.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Chamith
 */
@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
