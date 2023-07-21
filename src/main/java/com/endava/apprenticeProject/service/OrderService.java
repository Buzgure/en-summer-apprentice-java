package com.endava.apprenticeProject.service;

import com.endava.apprenticeProject.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order updateOrder(Order order);

    void deleteOrder(Order order);
}
