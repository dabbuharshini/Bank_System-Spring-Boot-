package com.bank.bank_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bank.bank_system.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByAadhaarNumber(String aadhaarNumber);

}