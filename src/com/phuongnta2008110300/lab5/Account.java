package com.phuongnta2008110300.lab5;

public class Account {
    String name;
    double stk,sodu;
    Account(String a){
        name = a;
    }
    void Stk(Double a){
        stk = a;
    }
    void Sodu(Double a){
        sodu = a;
    }
    void showData(){
        System.out.println("Tên: "+name);
        System.out.println("Số tài khoản: "+stk);
        System.out.println("Số dư tài khoản: "+sodu);
    }
}
