package com.qa.tbs.entities;

import java.sql.Blob;
import java.util.*;

public class Driver {

    private Integer driverId;

    private Integer taxiId;

    private String firstName;

    private String surname;

    private Blob photo;

    public Driver(Integer driverId, Integer taxiId, String firstName, String surname, Blob photo){
        this.driverId = driverId;
        this.taxiId = taxiId;
        this.firstName = firstName;
        this.surname = surname;
        this.photo = photo;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getTaxiId() {
        return taxiId;
    }

    public void setTaxiId(Integer taxiId) {
        this.taxiId = taxiId;
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

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

}
