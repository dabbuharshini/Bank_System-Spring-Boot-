package com.bank.bank_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bank_system.model.Account;
import com.bank.bank_system.model.Transaction;
import com.bank.bank_system.repository.AccountRepository;
import com.bank.bank_system.repository.TransactionRepository;

@Service
public class BankService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;
    public String createAccount(String name,String aadhaar,String phone,String address){

        // check if aadhaar already exists
        Account existingAccount = accountRepository.findByAadhaarNumber(aadhaar);

        if(existingAccount != null){
            return "Account already exists.";
        }

        Long accountNumber = generateAccountNumber();

        Account account = new Account();

        account.setAccountId(accountNumber);
        account.setName(name);
        account.setAadhaarNumber(aadhaar);
        account.setPhone(phone);
        account.setAddress(address);
        account.setBalance(0);

        accountRepository.save(account);

        return "Account created successfully.<br>Account Number: " + accountNumber;
    }

    public String deposit(Long id, Double amount){

        if(amount == null || amount <= 0){
            return "Invalid deposit amount. Please enter a positive value.";
        }

        Account account = accountRepository.findById(id).orElse(null);

        if(account == null){
            return "Account not found";
        }

        double before = account.getBalance();

        double after = before + amount;

        account.setBalance(after);

        accountRepository.save(account);

        Transaction t = new Transaction();

        t.setAccount(account);
        t.setDescription("Deposit of ₹" + amount);
        t.setBalanceBefore(before);
        t.setBalanceAfter(after);
        t.setTimestamp(java.time.LocalDateTime.now());

        transactionRepository.save(t);

        return "Deposit successful. Current Balance: ₹" + after;
    }

    public String withdraw(Long id, Double amount){

        if(amount == null || amount <= 0){
            return "Invalid withdrawal amount. Please enter a positive value.";
        }

        Account account = accountRepository.findById(id).orElse(null);

        if(account == null){
            return "Account not found";
        }

        double before = account.getBalance();

        if(amount > before){
            return "Insufficient balance. Current Balance: ₹" + before;
        }


        double minimumBalance = 1000;

        if(before - amount < minimumBalance){
            return "Withdrawal denied. Minimum balance ₹1000 must remain. Current Balance: ₹" + before;
        }
        

        double after = before - amount;

        account.setBalance(after);

        accountRepository.save(account);

        Transaction t = new Transaction();

        t.setAccount(account);
        t.setDescription("Withdrawal of ₹" + amount);
        t.setBalanceBefore(before);
        t.setBalanceAfter(after);
        t.setTimestamp(java.time.LocalDateTime.now());

        transactionRepository.save(t);

        return "Withdrawal successful. Current Balance: ₹" + after;
    }

    public double checkBalance(Long id) {

        Optional<Account> accountOpt = accountRepository.findById(id);

        if(accountOpt.isEmpty()) {
            return -1;
        }

        return accountOpt.get().getBalance();
    }
    public List<Transaction> getTransactions(Long id){
        return transactionRepository.findByAccountAccountId(id);
    }

    private Long generateAccountNumber(){

        java.util.Random random = new java.util.Random();

        Long accountNumber;

        do{

        accountNumber = 10000000000L + 
        (long)(random.nextDouble() * 90000000000L);

        }while(accountRepository.existsById(accountNumber));

        return accountNumber;

    }
}