package com.phuongnta2008110300.tuan5;

import java.util.Scanner;
public class Cow {
    double weight;
    Cow(){

    }
    void addWeight(){       
        System.out.print("Nhập địa chỉ : ");
        Scanner in= new Scanner(System.in);
        weight = in.nextFloat();
    }
    void ShowCustomer(){      
        System.out.println("Tên khách hàng: " +weight);
    }
}
