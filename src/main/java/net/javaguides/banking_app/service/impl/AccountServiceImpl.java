package net.javaguides.banking_app.service.impl;

import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.entity.Account;
import net.javaguides.banking_app.mapper.AccountMapper;
import net.javaguides.banking_app.repository.AccountRepository;
import net.javaguides.banking_app.service.AccountService;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountNotFoundException;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.maptoAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.maptoAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(long id) {
        Account account= accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        return AccountMapper.maptoAccountDto(account);
    }
}
