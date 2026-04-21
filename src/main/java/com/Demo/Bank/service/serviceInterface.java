package com.Demo.Bank.service;

import com.Demo.Bank.entity.Account;

import java.util.List;
import java.util.Optional;

public interface serviceInterface {
    String createAccount(Account account);
    List<Account> getAllAccounts();
    Optional<Account> getAccountById(Long id);
    String updateAccount(Long id,Account account);
}
