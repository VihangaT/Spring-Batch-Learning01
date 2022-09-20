package com.tech.vihanga.springbatch.config;

import com.tech.vihanga.springbatch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;


public class CustomerProcesser implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        return null;
    }
}
