package com.mouss.inventory.repository;

import com.mouss.inventory.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
