package com.phuongnta2008110300.tuan5;

public class Account2 {
    String accout_name;
    int accout_number ;
    int accout_balance ;


    Account2(String i,int b,int c)
    { 
        accout_name     = i;
        accout_number   = b;
        accout_balance  = c;
    }

    void showData()
    {
        System.out.println("Tên: "+ accout_name);
        System.out.println("Số tài khoản: "+ accout_number);
        System.out.println("Số dư: "+ accout_balance);
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
