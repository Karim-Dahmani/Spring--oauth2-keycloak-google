package com.example.customerfrontthymeleafapp.repository;

import com.example.customerfrontthymeleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
