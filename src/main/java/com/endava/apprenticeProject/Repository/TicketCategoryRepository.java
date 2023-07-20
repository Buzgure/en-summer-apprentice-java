package com.endava.apprenticeProject.Repository;

import com.endava.apprenticeProject.Model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Long> {
}
