package com.server.account.repository;

import java.util.List;

import com.server.account.model.Account;

public interface AccountRepository {
    List<Account> getAllAccounts();

    Account getAccount(String number);
}
