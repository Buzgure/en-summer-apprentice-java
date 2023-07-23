package com.endava.apprenticeProject.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "OrderDTO")
public class OrderDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "CustomerID")
    private Long customerId;

    @Column(name = "EventID")
    private Long eventId;

    @Column(name = "TicketCategoryID")
    private Long ticketCategoryId;

    @Column(name = "NumberOfTickets")
    private int numberOfTickets;


}
