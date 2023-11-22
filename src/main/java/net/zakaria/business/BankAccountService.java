package net.zakaria.model.business;

import net.zakaria.model.BankAccount;

import java.util.List;

public interface BankAccountService {
    void addAccount(BankAccount bankAccount);
    List<BankAccount> getAllAccounts();
    
}
