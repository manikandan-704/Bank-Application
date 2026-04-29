package com.Demo.Bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.hibernate.SpringImplicitNamingStrategy;
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String accountNumber;
    private String AccountHolderName;
    private String email;
    private Double balance;
    private String status;

    // Can be done using lamb ark @Builder,@Getter,@No args
    public Account(){}

    private Account(Builder builder){
        this.accountNumber=builder.accountNumber;
        this.AccountHolderName=builder.AccountHolderName;
        this.email=builder.email;
        this.balance=builder.balance;
        this.status=builder.status;
    }

    private static class Builder{
        private String accountNumber;
        private String AccountHolderName;
        private String email;
        private Double balance;
        private String status;

        public Builder accountNumber(String accountNumber){
            this.accountNumber=accountNumber;
            return this;
        }
        public Builder AccountHolderName(String AccountHolderName){
            this.AccountHolderName=AccountHolderName;
            return this;
        }
        public Builder email(String email){
            this.email=email;
            return this;
        }
        public Builder balance(Double balance){
            this.balance=balance;
            return this;
        }
        public Builder status(String status){
            this.status=status;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
