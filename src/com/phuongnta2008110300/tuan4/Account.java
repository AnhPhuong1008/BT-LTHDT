package com.phuongnta2008110300.tuan4;

public class Account {
    int accout_number ;
    int accout_balance ;

    Account(int a,int b)
    {
        accout_number   = a;
        accout_balance  = b;
    }

    void showData()
    {
        System.out.println("accout_number= "+ accout_number);
        System.out.println("accout_balance= "+ accout_balance);
    }

    void deposit(int amount)
    {
        accout_balance += amount;
    }

    void withdraw(int amount)
    {
        accout_balance -= amount;
    }
}
