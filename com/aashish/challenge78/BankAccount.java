// Define a bank Account class with private attributes like accountNumber, accountHolderName, and balance.
// Provide public methods to deposit and withdraw money, ensuring that these methods don't allow illegal operations like
// withdrawing more money than the current balance


package com.aashish.challenge78;

public class BankAccount {

    private String accountNumber;

    private String accountHolderName;

    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money) {
        if (money <= 0);
        System.out.println("Invalid Deposit");
        balance+= money;
    }
    public  double withdrawMoney(double money){
        if (balance >= money) {
            balance -= money;
        } else if (money <= 0) {
            System.out.println("Invalid Withdraw");
        }else {
            money = balance;
            balance = 0;
        }

        return money;
    }
}
