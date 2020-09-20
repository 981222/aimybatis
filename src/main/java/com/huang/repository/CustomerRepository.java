package com.huang.repository;

import com.huang.entity.Customer;

public interface CustomerRepository {
    public Customer findById(long id);
}
