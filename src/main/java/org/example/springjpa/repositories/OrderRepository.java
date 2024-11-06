package org.example.springjpa.repositories;

import org.example.springjpa.entities.Order;
import org.example.springjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
