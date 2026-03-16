package com.bank.bank_system.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bank.bank_system.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByAccountAccountId(Long accountId);

}