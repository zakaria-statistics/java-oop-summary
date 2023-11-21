package net.zakaria;

import net.zakaria.model.BankAccount;

public class Main {
    public static void main(String[] args) {




        BankAccount bankAccount = new BankAccount(10000,"MAD");
        BankAccount bankAccount1 = new BankAccount(10000,"MAD");
        BankAccount bankAccount2 = bankAccount;
        //o = o1 => o.hashcode() = o1.hashcode() get in consideration memory addresses and object state
        System.out.println("*************************************");
        bankAccount1.setAccountId(bankAccount.getAccountId());
        System.out.println(bankAccount);
        System.out.println(bankAccount1);
        System.out.println("*************************************");
        System.out.println("HAshCode  = "+ bankAccount.hashCode());
        System.out.println("HAshCode  = "+ bankAccount1.hashCode());
        System.out.println("equals methode : "+bankAccount.equals(bankAccount1));
        System.out.println("== sign method :"+(bankAccount == bankAccount2));
        System.out.println("*************************************");

    }
    public static void printAccount(BankAccount bankAccount){
        System.out.println("+++++++++++++++++++++");
        System.out.println(bankAccount);
        System.out.println("+++++++++++++++++++++");


    }
}