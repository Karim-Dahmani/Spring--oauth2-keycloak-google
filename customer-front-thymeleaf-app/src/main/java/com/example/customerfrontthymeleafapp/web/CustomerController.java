package com.example.customerfrontthymeleafapp.web;


import com.example.customerfrontthymeleafapp.entities.Customer;
import com.example.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public String custmoers(Model model){
        List<Customer> customersList= customerRepository.findAll();
        model.addAttribute("customers",customersList);
        return "customers";
    }
    @GetMapping("/products")
    public String products(Model model){
        return "products";
    }

    @GetMapping("/auth")
    @ResponseBody
    public Authentication authentication(Authentication authentication) {
        return authentication;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
