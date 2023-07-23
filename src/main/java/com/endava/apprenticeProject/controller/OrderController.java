package com.endava.apprenticeProject.controller;

import com.endava.apprenticeProject.model.Order;
import com.endava.apprenticeProject.service.OrderService;
import com.endava.apprenticeProject.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class OrderController {

    private final OrderServiceImpl orderService;
    @Autowired
    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @PostMapping("/orders/add")
    public Order saveOrder(@RequestParam Long eventId,@RequestParam Long ticketCategoryId, @RequestParam int numberOfTickets) {

        return orderService.addOrder(eventId, ticketCategoryId, numberOfTickets);
    }
}
