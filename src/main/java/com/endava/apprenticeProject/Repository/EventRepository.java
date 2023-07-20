package com.endava.apprenticeProject.Repository;

import com.endava.apprenticeProject.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
