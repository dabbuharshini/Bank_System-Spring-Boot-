package com.bank.bank_system.model;

import jakarta.persistence.*;

@Entity
public class Account {

    @Id
    private Long accountId;

    private String name;
    
    @Column(unique = true)
    private String aadhaarNumber;

    private String phone;

    private String address;

    private double balance;

    public Account(){}

    public Long getAccountId(){
        return accountId;
    }

    public void setAccountId(Long accountId){
        this.accountId=accountId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getAadhaarNumber(){
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber){
        this.aadhaarNumber=aadhaarNumber;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
}