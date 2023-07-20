package com.endava.apprenticeProject.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TicketCategory")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "EventID")
    private Event event;

    @Column(name = "Description")
    private String description;

    @Column(name = "Price")
    private float price;

    public TicketCategory() {
    }

    public TicketCategory(Long id, Event event, String description, float price) {
        this.id = id;
        this.event = event;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
