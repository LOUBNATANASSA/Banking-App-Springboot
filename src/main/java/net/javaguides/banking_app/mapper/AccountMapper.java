package net.javaguides.banking_app.mapper;

import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.entity.Account;

public class AccountMapper {
    public static Account maptoAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName()  ,
                accountDto.getAccount().getBalance()
        );

return account;
    }
    public static AccountDto maptoAccountDto(Account account) {
AccountDto accountDto = new AccountDto(
        account.getId(),
        account.getAccountHolderName(),
        account.getBalance()

);
return accountDto;

    }
}
