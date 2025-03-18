package net.javaguides.banking_app.service;

import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.entity.Account;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(long id);

}
