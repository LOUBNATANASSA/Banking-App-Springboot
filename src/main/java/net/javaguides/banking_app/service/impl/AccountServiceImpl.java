package net.javaguides.banking_app.service.impl;

import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.repository.AccountRepository;
import net.javaguides.banking_app.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }
}
