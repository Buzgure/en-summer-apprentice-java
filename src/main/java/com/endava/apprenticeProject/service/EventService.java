package com.endava.apprenticeProject.service;

import com.endava.apprenticeProject.model.Event;

import java.util.List;

public interface EventService {
     List<Event> showAllEvents();
     List<Event> sortByDate();
     List<Event> sortByPrice();
     List<Event> searchbyName(String name);
     List<Event> filterByType(String type);
}
