package com.example.levanluc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.levanluc.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
