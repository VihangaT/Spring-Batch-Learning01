package com.tech.vihanga.springbatch.repository;

import com.tech.vihanga.springbatch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
