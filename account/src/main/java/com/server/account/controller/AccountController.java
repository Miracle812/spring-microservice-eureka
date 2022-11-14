package com.server.account.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.server.account.model.Account;
import com.server.account.repository.AccountRepository;

@RestController
public class AccountController {
    protected Logger logger = Logger.getLogger(AccountController.class.getName());

    @Autowired
    AccountRepository accountRepository;

    @RequestMapping("/accounts")
    public Account[] all() {
        logger.info("accounts-microservice all() invoked");
        List<Account> accounts = accountRepository.getAllAccounts();
        logger.info("account-microsevice all() found" + accounts.size());
        return accounts.toArray(new Account[accounts.size()]);
    }

    @RequestMapping("/accounts/{id}")
    public Account byId(@PathVariable("id") String id) {
        logger.info("accounts-microservice byId() invoked:" + id);
        Account account = accountRepository.getAccount(id);
        logger.info("account-microservice byId() found" + account);
        return account;
    }
}
