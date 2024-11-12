package com.cw.Ticketsystem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vendorId;
    private String vendorName;
    private String vendorUserName;
    private String vendorEmail;
    private String vendorPassword;
    public Vendor() {}
    public void Vendor(int vendorId,String vendorName,String vendorUserName,String vendorEmail,String vendorPassword){
        this.vendorId=vendorId;
        this.vendorName=vendorName;
        this.vendorUserName=vendorUserName;
        this.vendorEmail=vendorEmail;
        this.vendorPassword=vendorPassword;
    }
    public int getVendorId() {
        return vendorId;
    }
    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public String getVendorUserName() {
        return vendorUserName;
    }
    public void setVendorUserName(String vendorUserName) {
        this.vendorUserName = vendorUserName;
    }
    public String getVendorEmail() {
        return vendorEmail;
    }
    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }
    public String getVendorPassword() {
        return vendorPassword;
    }
    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }
}


