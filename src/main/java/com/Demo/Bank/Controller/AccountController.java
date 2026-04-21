package com.Demo.Bank.Controller;

import com.Demo.Bank.entity.Account;
import com.Demo.Bank.service.ServiceImpl.serviceImplementation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    @GetMapping
    public List<Account> getAllAccounts(){
        return simpleService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable Long id){
        return simpleService.getAccountById(id);
    }

    @PutMapping("/{id}")
    public String updateAccount(@PathVariable Long id,@RequestBody Account account){
        return simpleService.updateAccount(id,account);
    }

    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable Long id){
        return simpleService.deleteAccount(id);
    }

    @PatchMapping("/{id}")
    public String patchAccount(@PathVariable Long id,@RequestBody Map<String,Object>update){
        return simpleService.patchAccount(id,update);
    }


}
