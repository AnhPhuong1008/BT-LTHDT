package com.phuongnta2008110300.tuan5;

public class Account {
    String name,address,position,birthday;
    double salary;
    Account(String a){
        name = a;
    }
    void ImportAddress(String text){
        address = text;
    }
    void ImportSalary(int amount){
        salary = amount;
    }
    void ImportPosition(String text){
        position = text;
    }
    void ImportBirthday(String text){
        birthday = text;
    }
    void showData(){
        System.out.println("Tên: "+name);
        System.out.println("Lương: "+salary);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Bộ Phận: "+position);
        System.out.println("Ngày sinh: "+birthday);
    }
}
