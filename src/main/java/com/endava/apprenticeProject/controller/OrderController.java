package com.endava.apprenticeProject.controller;

import com.endava.apprenticeProject.model.Order;
import com.endava.apprenticeProject.service.OrderService;
import com.endava.apprenticeProject.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(name = "/api/v1")
public class OrderController {

    private final OrderServiceImpl orderService;
    @Autowired
    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping(name = "/orders")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
}
