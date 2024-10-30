package com.example.bank_account_prototype;

public interface IBankAccount {
    String withDrawInAmount(Double amount);
    String transfer(String recipientAccount, String recipientAgency);
    String cancelAccount(String account);
    Double consultExtract(String account);
    Double consultBalance(String account);
}
