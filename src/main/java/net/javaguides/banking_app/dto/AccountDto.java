package net.javaguides.banking_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.javaguides.banking_app.entity.Account;
@Data
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private Account account;

    public AccountDto(Long id, String accountHolderName, double balance) {
    }
}
