package net.javaguides.banking_app.service;

import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(long id);
    AccountDto deposit(long id, double amount);
    AccountDto withdraw(long id, double amount);
    List<AccountDto> getAllAccounts();

}
