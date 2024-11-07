package org.example.springjpa.repositories;

import org.example.springjpa.entities.OrderItem;
import org.example.springjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
