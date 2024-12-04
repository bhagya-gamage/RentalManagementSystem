package edu.icet.service;

import edu.icet.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {
    List<Customer> getAll();
    void addCustomer(Customer customer);
    void deleteCustomerById(Integer id);
    Customer searchCustomerById(Integer id);
    void updateCustomerById(Customer customer);
}
