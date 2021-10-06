package com.phuongnta2008110300.Lab2;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số điện: ");
        int a = input.nextInt();
        if(a<50)
            System.out.println("Số tiền phải trả là: "+a*1000);
        else
            System.out.println("Tổng tiền phải trả:"+(a = 50*1000 + (a-50)*1200));
       
    }
}
