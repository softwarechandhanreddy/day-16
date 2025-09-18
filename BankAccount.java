package com.codegnan.oopexamples;

class BankAccount {
    double balance;

    
    public BankAccount(double openingBalance) {
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Cash deposit of ₹" + amount + " successful.");
    }

    
    public void deposit(double amount, String chequeNo) {
        balance += amount;
        System.out.println("Cheque deposit of ₹" + amount + " successful. Cheque No: " + chequeNo);
    }

    
    public void deposit(double amount, String transactionId, String bankName) {
        balance += amount;
        System.out.println("Online transfer of ₹" + amount + " successful. Transaction ID: " 
                           + transactionId + ", Bank: " + bankName);
    }

   
    public void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

}