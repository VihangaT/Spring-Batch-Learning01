package com.tech.vihanga.springbatch.repository;

import com.tech.vihanga.springbatch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustormerRepository extends JpaRepository<Customer,Integer> {
}
