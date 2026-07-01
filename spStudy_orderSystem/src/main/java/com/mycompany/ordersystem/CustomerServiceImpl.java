package com.mycompany.ordersystem;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl (CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public Customer getCoustomer(long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public List<Customer> getCustomersByName(String name) {
        return customerRepository.findByName(name);
    }

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(long id) {
        customerRepository.delete(id);
    }
}
