package com.server.consumer.repository;

import java.util.List;

import com.server.consumer.model.Account;

public interface AccountRepository {
    List<Account> getAllAccounts();

    Account getAccount(String number);

}
