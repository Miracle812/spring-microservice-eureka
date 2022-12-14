package com.server.account.model;

import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long amount;
    private String number;
    private String name;

    public Account(Long i, String name, String number) {
        super();
        this.amount = i;
        this.number = number;
        this.name = name;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account [ amount=" + amount + ", number" + number + ", name=" + name + " ]";
    }
}
