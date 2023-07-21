package com.endava.apprenticeProject.controller;

import com.endava.apprenticeProject.model.Event;
import com.endava.apprenticeProject.service.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EventController {
    private final EventServiceImpl eventService;
    @Autowired
    public EventController(EventServiceImpl eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public List<Event> getAllEvents(){return eventService.showAllEvents();}

    @GetMapping("/events/sorted")
    public List<Event> getEventsSortedByDate(){
        return eventService.sortByDate();
    }
    @GetMapping("/events/sorted/byPrice")
    public List<Event> getEventsSortedByPrice(){
        return eventService.sortByPrice();
    }

    @PostMapping("/addEvent")
    public Event addEvent(@RequestBody Event event){
        return eventService.saveEvent(event);
    }

}
