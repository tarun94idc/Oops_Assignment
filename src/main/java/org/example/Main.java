package org.example;

public class Main {
    public static void main(String[] args) {
        Account a=new Account("idc123", "Anuj", 23000);

        Account b=new Account("idc234", "Ravi");

        System.out.println(a.getId());
        System.out.println(a.getName());
        System.out.println(a.getBalance());

        System.out.println(b.getId());
        System.out.println(b.getName());

        a.Credit(500);
        a.Debit(1000);
        a.transferTo();

        a.toString();
        System.out.println(a);
        System.out.println(b);
    }
}