package com.Demo.Bank.service;

import com.Demo.Bank.dto.AccountDto;
import com.Demo.Bank.entity.Account;

public interface serviceInterface {
      Account createAccount(AccountDto account);
//    List<Account> getAllAccounts();
//    Optional<Account> getAccountById(Long id);
//    String updateAccount(Long id,Account account);
//    String deleteAccount(Long id);
//    String patchAccount(Long id, Map<String,Object>update);
}
