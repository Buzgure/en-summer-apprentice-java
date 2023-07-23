package com.endava.apprenticeProject.repository;

import com.endava.apprenticeProject.model.OrderDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDTORepository extends JpaRepository<OrderDTO, Long> {
}
