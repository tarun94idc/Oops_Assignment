package org.example;

import java.util.Scanner;

public class Account {
    private String id;
    private String name;
     int balance=0;
    int amount;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void Credit(int amount){
        balance=amount+balance;
        System.out.println(balance);
    }

    public void Debit(int amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println(balance);
        }
        else{
            System.out.println("Amount Exceeded Balance");
        }
    }

    public void transferTo() {
        if (amount <= balance) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an account number");
            int acc1 = scan.nextInt();
            System.out.println("Enter a amount");
            int amt = scan.nextInt();
            int acc2 ;
            if (acc1 == 1000) {
                acc2 = amount+amt;
                System.out.println(acc2);
                System.out.println("Transferred Successfully");
            }else{
                System.out.println("invalid account number");
            }

        }else {
            System.out.println("Amount Exceeded Balance");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
