package com.endava.apprenticeProject.controller;

import com.endava.apprenticeProject.model.Event;
import com.endava.apprenticeProject.service.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EventController {
    @Autowired
    private EventServiceImpl eventService;

    @GetMapping("/events")
    public List<Event> getAllEvents(){return eventService.showAllEvents();}

    @GetMapping("/sortByDateAndPrice")
    public List<Event> getEventsSortedByDateAndPrice(){
        return eventService.sortByDateAndPrice();
    }

    @PostMapping("/addEvent")
    public Event addEvent(@RequestBody Event event){
        return eventService.saveEvent(event);
    }

}
