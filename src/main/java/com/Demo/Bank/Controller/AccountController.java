package com.Demo.Bank.Controller;

import com.Demo.Bank.entity.Account;
import com.Demo.Bank.service.ServiceImpl.serviceImplementation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Control all the api calls
@RequestMapping("/account")
public class AccountController {

    private final serviceImplementation simpleService;
    public AccountController(serviceImplementation simpleService){
        this.simpleService=simpleService;
    }    // constructor

    @PostMapping
    public String createAccount(@RequestBody Account account){
        return simpleService.createAccount(account);
    }
}
