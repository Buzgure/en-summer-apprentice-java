package com.endava.apprenticeProject.service;

import com.endava.apprenticeProject.model.Customer;
import com.endava.apprenticeProject.model.Order;
import com.endava.apprenticeProject.repository.CustomerRepository;
import com.endava.apprenticeProject.repository.OrderDTORepository;
import com.endava.apprenticeProject.repository.OrderRepository;
import com.endava.apprenticeProject.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{
    OrderRepository orderRepository;
    OrderDTORepository orderDTORepository;
    TicketCategoryRepository ticketCategoryRepository;
    CustomerRepository customerRepository;
    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, OrderDTORepository orderDTORepository, TicketCategoryRepository ticketCategoryRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.orderDTORepository = orderDTORepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order updateOrder(Order order) {
        Order toUpdate = orderRepository.findById(order.getId()).orElse(null);
        assert toUpdate != null;
        orderRepository.delete(toUpdate);
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }

    @Override
    public Order addOrder( Long eventId, Long ticketCategoryId, int numberOfTickets) {

        float ticketPrice = ticketCategoryRepository.findById(ticketCategoryId).get().getPrice();
        float price = ticketPrice * numberOfTickets;
        Order toAdd = new Order();
        toAdd.setOrderedAt(LocalDateTime.now());

        toAdd.setCustomer(customerRepository.findById(1L).get());
        toAdd.setTotalPrice(price);
        toAdd.setNumberOfTickets(numberOfTickets);
        toAdd.setTicketCategory(ticketCategoryRepository.findById(ticketCategoryId).get());
        orderRepository.save(toAdd);
        return toAdd;

    }


}
