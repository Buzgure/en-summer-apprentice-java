package com.endava.apprenticeProject.controller;

import com.endava.apprenticeProject.model.Customer;
import com.endava.apprenticeProject.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;


    @GetMapping("/customers")
    public List<Customer> getALlCustomers(){
        return customerService.getAllCustomers();
    }
    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

}
