package net.zakaria;

import net.zakaria.business.BankAccountService;
import net.zakaria.business.BankAccountServiceImpl;
import net.zakaria.exceptions.AccountNotFoundException;
import net.zakaria.model.BankAccount;
import net.zakaria.model.CurrentAccount;
import net.zakaria.model.SavingAccount;

import java.util.function.Consumer;

public class Application {

    public static void main(String[] args) {

        BankAccountService bankAccountService = new BankAccountServiceImpl();
        bankAccountService.addAccount(new CurrentAccount(2345,"mad",3454));
        bankAccountService.addAccount(new SavingAccount(2345,"mad",3.4));
        bankAccountService.addAccount(new CurrentAccount(12345,"mad",1231));
        bankAccountService.getAllAccounts().get(0).setAccountId("CC1");

        //bankAccountService.getAllAccounts().forEach(System.out::println);
        //bankAccountService.getAllAccounts().forEach(bankAccount -> System.out.println(bankAccount));
        bankAccountService.getAllAccounts().forEach(new Consumer<BankAccount>() {
            @Override
            public void accept(BankAccount bankAccount) {
                System.out.println(bankAccount);
            }
        });
        /*try {
            System.out.println(bankAccountService.getAccountById("CC2"));
        } catch (Exception e) {

            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
            // e.printStackTrace();
        }*/
        try {
            System.out.println(bankAccountService.getAccountById("CC2"));
        } catch (AccountNotFoundException e) {
            /*System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
            e.printStackTrace();*/
            throw new RuntimeException(e);
        }
        System.out.println("----------- suite ------------");
    }

}
