package net.javaguides.banking_app.controller;

import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private AccountService accountService;


    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    //ADD API Rest API
   @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    //SET ACCOUNT REST API
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable long id) {
        AccountDto accountDto=accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);

    }

    //deposit REST API
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id,
                                              @RequestBody Map<String,Double> request) {
        AccountDto accountDto=accountService.deposit(id,request.get("amount"));
        return ResponseEntity.ok(accountDto);
    }

    //withdraw REST API
    @PostMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> widthraw (@PathVariable long id,@RequestBody Map<String,Double> request) {
        double amount=request.get("amount");
        AccountDto accountDto=accountService.withdraw(id,amount);
        return ResponseEntity.ok(accountDto);
    }


    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        List<AccountDto> accounts = accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }


}
