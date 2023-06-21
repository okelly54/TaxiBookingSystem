package com.qa.tbs.entities;

public class PaymentInfo {
    private Integer paymentId;

    private Integer customerId;

    private String nameOnCard;

    private String sortCode;

    private String accNum;

    public PaymentInfo(Integer paymentId, Integer customerId, String nameOnCard, String sortCode, String accNum){
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.nameOnCard = nameOnCard;
        this.sortCode = sortCode;
        this.accNum = accNum;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

}
