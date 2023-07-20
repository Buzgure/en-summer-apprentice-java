package com.endava.apprenticeProject.repository;

import com.endava.apprenticeProject.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Long> {
}
