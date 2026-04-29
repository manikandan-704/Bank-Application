package com.Demo.Bank.service.ServiceImpl;

import com.Demo.Bank.entity.Account;
import com.Demo.Bank.repository.AccountRepository;
import com.Demo.Bank.service.serviceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class serviceImplementation implements serviceInterface {

    private final AccountRepository accountRepository;

    public serviceImplementation(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }   // Constructor

    @Override
    public void createAccount(Account account) {
        accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> getAccountById(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public String updateAccount(Long id, Account account) {
        Account account1=accountRepository.findById(id).get();
        account1.setAccountHolderName(account.getAccountHolderName());
        account1.setBalance(account.getBalance());
        accountRepository.save(account1);
        return "Account Updated Successfully";
    }

    @Override
    public String deleteAccount(Long id) {
        accountRepository.deleteById(id);
        return "Account "+id+" Deleted";
    }

    @Override
    public String patchAccount(Long id, Map<String, Object> update) {
        Account acc=accountRepository.findById(id).get();
        update.forEach((key,val)->{
            switch (key){
                case "AccountHolderName":
                    acc.setAccountHolderName((String)val);
                    break;
                case "balance":
                    acc.setBalance((Double) val);
                    break;
            }
        });
        accountRepository.save(acc);
        return "Patch Updated";
    }
}
