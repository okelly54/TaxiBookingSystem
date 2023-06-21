package com.qa.tbs.entities;

public class Booking {
    private Integer bookingId;
    private Integer customerId;
    private Integer driverId;
    private Integer passengers;
    private String pickup;
    private String dropOff;
    private Double cost;

    public Booking(Integer bookingId, Integer customerId, Integer driverId, Integer passengers, String pickup, String dropOff, Double cost){
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.driverId = driverId;
        this.passengers = passengers;
        this.pickup = pickup;
        this.dropOff = dropOff;
        this.cost = cost;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDropOff() {
        return dropOff;
    }

    public void setDropOff(String dropOff) {
        this.dropOff = dropOff;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

}
