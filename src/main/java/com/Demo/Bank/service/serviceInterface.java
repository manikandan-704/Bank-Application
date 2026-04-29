package com.Demo.Bank.service;

import com.Demo.Bank.dto.AccountDto;
import com.Demo.Bank.entity.Account;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface serviceInterface {
    void createAccount(AccountDto account);
    List<Account> getAllAccounts();
    Optional<Account> getAccountById(Long id);
    String updateAccount(Long id,Account account);
    String deleteAccount(Long id);
    String patchAccount(Long id, Map<String,Object>update);
}
