package com.cw.Ticketsystem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private  String customerName;
    public Customer() {}
    public void customer(int customerId,String customerName){
        this.customerId=customerId;
        this.customerName=customerName;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String  getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerId = customerId;
    }
}
