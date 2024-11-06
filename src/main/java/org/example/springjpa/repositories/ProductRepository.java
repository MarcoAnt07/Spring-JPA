package org.example.springjpa.repositories;

import org.example.springjpa.entities.Category;
import org.example.springjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
