package com.example.levanluc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.levanluc.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
