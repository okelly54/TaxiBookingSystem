package com.qa.tbs.entities;

import java.util.*;

public class Customer {
    private Integer customerId;
    private String firstName;
    private String surname;
    private Date dob;
    private String address1;
    private String address2;
    private String postcode;
    private String number;

    public Customer(Integer customerId, String firstName, String surname, Date dob, String address1, String address2, String postcode, String number) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.surname = surname;
        this.dob = dob;
        this.address1 = address1;
        this.address2 = address2;
        this.postcode = postcode;
        this.number = number;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // getters and setters for all DB attributes under customer table

}
