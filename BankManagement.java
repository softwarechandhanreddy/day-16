package com.codegnan.oopexamples;

public class BankManagement {

public static void main(String[] args) {
        
    	BankAccount acc = new BankAccount(10000);

        acc.deposit(10000); 
        acc.deposit(2000,"CHQ12345"); 
        acc.deposit(30000, "TXN123456", "SBI Bank"); 
        acc.showBalance();
    }
}
