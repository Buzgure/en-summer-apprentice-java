package com.endava.apprenticeProject.Controller;

import com.endava.apprenticeProject.Model.Customer;
import com.endava.apprenticeProject.Service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
