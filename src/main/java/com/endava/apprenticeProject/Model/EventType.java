package com.endava.apprenticeProject.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "EventType")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EventTypeName")
    private String eventTypeName;

    public EventType() {
    }

    public EventType(Long id, String eventTypeName) {
        this.id = id;
        this.eventTypeName = eventTypeName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
}
