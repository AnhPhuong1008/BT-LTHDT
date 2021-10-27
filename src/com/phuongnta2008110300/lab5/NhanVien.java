package com.phuongnta2008110300.lab5;

public class NhanVien {
    String name,address,position,birthday;
    double salary;
    Account(String a){
        name = a;
    }
    void ImportAddress(String a){
        address = a;
    }
    void ImportSalary(int a){
        salary = a;
    }
    void ImportPosition(String a){
        position = a;
    }
    void ImportBirthday(String a){
        birthday = a;
    }
    void showData(){
        System.out.println("Tên: "+name);
        System.out.println("Lương: "+salary);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Bộ Phận: "+position);
        System.out.println("Ngày sinh: "+birthday);
    }
}
