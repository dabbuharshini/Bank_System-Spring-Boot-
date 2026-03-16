package com.bank.bank_system.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private double balanceBefore;

    private double balanceAfter;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;

    public Transaction(){}

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public double getBalanceBefore(){
        return balanceBefore;
    }

    public void setBalanceBefore(double balanceBefore){
        this.balanceBefore=balanceBefore;
    }

    public double getBalanceAfter(){
        return balanceAfter;
    }

    public void setBalanceAfter(double balanceAfter){
        this.balanceAfter=balanceAfter;
    }

    public LocalDateTime getTimestamp(){
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp){
        this.timestamp=timestamp;
    }

    public Account getAccount(){
        return account;
    }

    public void setAccount(Account account){
        this.account=account;
    }
}