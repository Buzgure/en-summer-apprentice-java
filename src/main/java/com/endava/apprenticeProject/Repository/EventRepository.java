package com.endava.apprenticeProject.repository;

import com.endava.apprenticeProject.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
