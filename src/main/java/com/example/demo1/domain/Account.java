package com.example.demo1.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.lang.reflect.Type;

@Entity
@Table(name="account")
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int accountNumber;
    public String accountName;

    @OneToOne
    @JoinColumn(name="id",referencedColumnName = "id")
    private User user;

//    public Account() {
//    }

//    public Account(String accountName) {
//        this.accountName = accountName;
//    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
