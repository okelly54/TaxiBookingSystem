package com.qa.tbs.service.customer;

import com.qa.tbs.entities.Customer;

import java.util.Date;
import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer c);
    Customer getById(int id);
    List<Customer> getAll();
    Customer update(int id, String firstName, String surname, Date dob, String address1, String address2, String postcode, String number);

    //    private Integer customerId;
    //    private String firstName;
    //    private String surname;
    //    private Date dob;
    //    private String address1;
    //    private String address2;
    //    private String postcode;
    //    private String number;
}
