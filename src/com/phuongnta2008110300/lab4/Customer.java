package com.phuongnta2008110300.lab4;

import java.util.Scanner;

public class Customer {
    String KhachHang ;
    String DiaChi;
    Customer(){
       
    }
    void getName(){
        System.out.print(" Nhập tên khách hàng: ");
        Scanner in = new Scanner(System.in);
        KhachHang = in.nextLine();
        
    }
    void getAddress(){       
        System.out.print("Nhập địa chỉ : ");
        Scanner in= new Scanner(System.in);
        DiaChi = in.nextLine();
    }
    void ShowCustomer(){      
        System.out.println("Tên khách hàng: " + KhachHang);
        System.out.println("Địa Chỉ: " + DiaChi);
    }
}
