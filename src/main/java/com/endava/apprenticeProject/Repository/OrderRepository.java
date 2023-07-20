package com.endava.apprenticeProject.Repository;

import com.endava.apprenticeProject.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
