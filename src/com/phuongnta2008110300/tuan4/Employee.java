package com.phuongnta2008110300.tuan4;

import java.util.Scanner;

public class Employee {
    String NhanVien ;
    String Luong;
    Employee(){
       
    }
    void getName(){
        System.out.print(" Nhập tên nhân viên: ");
        Scanner in = new Scanner(System.in);
        NhanVien = in.nextLine();
        
    }
    void getSalary(){       
        System.out.print("Nhập lương : ");
        Scanner in= new Scanner(System.in);
        Luong = in.nextLine();
    }
    void ShowEmployee(){      
        System.out.println("Tên Nhân Viên: " + NhanVien);
        System.out.println("Lương: " +Luong);
    }
}
