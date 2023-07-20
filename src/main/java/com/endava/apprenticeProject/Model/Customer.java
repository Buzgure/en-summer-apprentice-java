package com.endava.apprenticeProject.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "CustomerName")
    private String customerName;

    @Column(name = "Email")
    private String email;


    public Customer() {
    }

    public Customer(Long id, String customerName, String email) {
        this.id = id;
        this.customerName = customerName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
