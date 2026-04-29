package com.Demo.Bank.Controller;

import com.Demo.Bank.dto.AccountDto;
import com.Demo.Bank.entity.Account;
import com.Demo.Bank.service.ServiceImpl.serviceImplementation;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

@RestController  //Control all the api calls
@RequestMapping("/account")
public class AccountController {

    private static final Logger log= (Logger) LoggerFactory.getLogger(AccountController.class);

    private final serviceImplementation simpleService;
    public AccountController(serviceImplementation simpleService){
        this.simpleService=simpleService;
    }    // constructor

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody AccountDto account){
        simpleService.createAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body("Account Created Successfully");
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAllAccounts(){
        return ResponseEntity.status(HttpStatus.OK).body(simpleService.getAllAccounts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Account>> getAccountById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(simpleService.getAccountById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateAccount(@PathVariable Long id,@RequestBody Account account){
        return ResponseEntity.status(HttpStatus.OK).body(simpleService.updateAccount(id,account));
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
