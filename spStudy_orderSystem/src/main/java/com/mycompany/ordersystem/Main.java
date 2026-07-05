package com.mycompany.ordersystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = context.getBean("customerService", CustomerService.class);
        List<Customer> customers = customerService.getCustomers();



        Customer newCustomer = new Customer();
        newCustomer.setId(6);
        newCustomer.setName("김육");
        newCustomer.setAddress("광주시");
        newCustomer.setEmail("dsdsa@dsadsa.dsa");
        customerService.saveCustomer(newCustomer);

        Customer customer6 = customerService.getCoustomer(6);
        customerService.deleteCustomer(1);

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

/*
    AppConfig.class,  CustomerService.class
    둘 다 Class 객체를 넘기는 건 맞지만, 용도가 완전히 다르다.

    AppConfig.class 여기서는 "이 설정 클래스를 읽어서 Spring 컨테이너를 만들어."

    CustomerService.class 여기서는 "customerService라는 Bean을 가져오는데, CustomerService 타입으로 반환해."
*/