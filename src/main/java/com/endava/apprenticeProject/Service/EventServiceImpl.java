package com.endava.apprenticeProject.service;

import com.endava.apprenticeProject.model.Event;
import com.endava.apprenticeProject.model.TicketCategory;
import com.endava.apprenticeProject.repository.EventRepository;
import com.endava.apprenticeProject.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService{
    private final EventRepository eventRepository;
    private final TicketCategoryRepository ticketCategoryRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository, TicketCategoryRepository ticketCategoryRepository) {
        this.eventRepository = eventRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    @Override
    public List<Event> showAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public List<Event> sortByDateAndPrice() {
        List<TicketCategory> tickets = ticketCategoryRepository.findAll();
        return eventRepository.findAll().stream().sorted(Comparator.comparing(Event::getStartDate)
                .thenComparing(event -> tickets.stream().filter(ticket-> Objects.equals(ticket.getEvent().getId(), event.getId())).findFirst().map(TicketCategory::getPrice)
                        .orElse(Float.MAX_VALUE))).collect(Collectors.toList());
    }

    @Override
    public List<Event> searchbyName(String name) {

        return eventRepository.findAll().stream().filter(event -> event.getEventName().equals(name)).collect(Collectors.toList());

    }

    @Override
    public List<Event> filterByType(String type) {
        return null;


    }

    public Event saveEvent(Event event){
        return eventRepository.save(event);
    }

    public Event getEventById(Long id){
        return eventRepository.findById(id).orElse(null);
    }

    public void deleteEvent(Event event){
        eventRepository.delete(event);
    }
}
