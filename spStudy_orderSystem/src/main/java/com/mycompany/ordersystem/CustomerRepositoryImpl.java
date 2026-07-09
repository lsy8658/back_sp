package com.mycompany.ordersystem;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
    private List<Customer> customers;

    public CustomerRepositoryImpl() {
        customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("김일");
        customer.setAddress("서울시");
        customer.setEmail("kim@naver.com");
        customers.add(customer);

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setName("김이");
        customer2.setAddress("부산시");
        customer2.setEmail("kim2@naver.com");
        customers.add(customer2);

        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setName("김삼");
        customer3.setAddress("세종시");
        customer3.setEmail("kim3@naver.com");
        customers.add(customer3);

        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setName("김사");
        customer4.setAddress("성남시");
        customer4.setEmail("kim4@naver.com");
        customers.add(customer4);

        Customer customer5 = new Customer();
        customer5.setId(5);
        customer5.setName("김오");
        customer5.setAddress("대구시");
        customer5.setEmail("kim5@naver.com");
        customers.add(customer5);

        Customer customer6 = new Customer();
        customer5.setId(6);
        customer5.setName("김육");
        customer5.setAddress("청주");
        customer5.setEmail("kim6@naver.com");
        customers.add(customer6);
    }
    public Customer findById(long id) {
         for (Customer customer : customers) {
             if (customer.getId() == id) {
                 return customer;
             }
         }
        return null;
    }

    public List<Customer> findAll() {
        return customers;
    }

    public List<Customer> findByName(String name) {
        List<Customer> list = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                Customer cust = new Customer();
                cust.setId(customer.getId());
                cust.setName(customer.getName());
                cust.setAddress(customer.getAddress());
                cust.setEmail(customer.getEmail());
                list.add(customer);
            }
        }
        return list;
    }

    public void save(Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customer.getId() == customers.get(i).getId()) {
                customers.set(i, customer);
                return;
            }
        }
        customers.add(customer);
    }

    public void delete(long id) {
        Customer customer = findById(id);
        if (customer != null) {
            customers.remove(customer);
        }
    }
}
