package net.zakaria;

import net.zakaria.model.BankAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class App {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[4];
        bankAccounts[0] = new BankAccount(23462,"Mad");
        bankAccounts[1] = new BankAccount(12346,"usd");
        bankAccounts[2] = new BankAccount(24346,"eur");
        bankAccounts[3] = new BankAccount(23646,"usd");
        System.out.println("###########array###############");
        for (BankAccount b :
                bankAccounts) {
            System.out.println(b);
        }
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(new BankAccount(333,"foo"));
        bankAccountList.add(new BankAccount(444,"moo"));
        bankAccountList.add(new BankAccount(222,"boo"));
        bankAccountList.add(new BankAccount(777,"bazz"));
        bankAccountList.add(new BankAccount(666,"fizz"));

        System.out.println("++++++++++++++lists+++++++++++++++++++");

        for (BankAccount b : bankAccountList){
            System.out.println(b);
        }
        System.out.println("_________Map____________");
        Map<String, BankAccount> bankAccountMap = new HashMap<>();
        bankAccountMap.put("cc1", new BankAccount(222333,"fizzbazz"));
        bankAccountMap.put("cc2", new BankAccount(4972, "fizz"));
        bankAccountMap.put("cc3", new BankAccount(322424, "bazz"));
        System.out.println("+++++++++++++loop through keys+++++++++++");
        for (String key:bankAccountMap.keySet()) {
            System.out.println(bankAccountMap.get(key));
        }
        System.out.println("###########loop by values##############");
        for (BankAccount b:bankAccountMap.values()) {
            System.out.println(b);
        }
        System.out.println("...............looping by both keys and values..............");
        for (Map.Entry<String, BankAccount> entry : bankAccountMap.entrySet()) {
            System.out.println("the key = "+entry.getKey()+" && the value "+entry.getValue());
        }

    }
}
