package com.gmellocorp.course.repositories;

import com.gmellocorp.course.entities.OrderItem;
import com.gmellocorp.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
