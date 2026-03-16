package com.bank.bank_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bank.bank_system.service.BankService;
import com.bank.bank_system.model.Transaction;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    /* Create Account */

    @GetMapping("/create")
    public String createAccount(
    @RequestParam String name,
    @RequestParam String aadhaar,
    @RequestParam String phone,
    @RequestParam String address){

    return bankService.createAccount(name,aadhaar,phone,address);

    }
    

    /* Deposit */

    @GetMapping("/deposit")
    public String deposit(@RequestParam Long id,
                          @RequestParam double amount) {

        return bankService.deposit(id, amount);
    }

    /* Withdraw */

    @GetMapping("/withdraw")
    public String withdraw(@RequestParam Long id,
                           @RequestParam double amount) {

        return bankService.withdraw(id, amount);
    }

    /* Balance */

    @GetMapping("/balance")
    public double balance(@RequestParam Long id) {

        return bankService.checkBalance(id);
    }

    /* Transactions */
    @GetMapping("/transactions")
    public List<Transaction> transactions(@RequestParam Long id){

    return bankService.getTransactions(id);

    }
}