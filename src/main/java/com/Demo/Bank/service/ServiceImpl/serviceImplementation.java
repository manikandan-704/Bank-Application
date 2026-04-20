package com.Demo.Bank.service.ServiceImpl;

import com.Demo.Bank.entity.Account;
import com.Demo.Bank.repository.AccountRepository;
import com.Demo.Bank.service.serviceInterface;
import org.springframework.stereotype.Service;

@Service
public class serviceImplementation implements serviceInterface {

    private final AccountRepository accountRepository;

    public serviceImplementation(AccountRepository accountRepository){
        this.accountRepository=accountRepository;
    }   // Constructor

    @Override
    public String createAccount(Account account){
        accountRepository.save(account);
        return "Account Created";
    }
}
