package com.gmellocorp.course.repositories;

import com.gmellocorp.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
