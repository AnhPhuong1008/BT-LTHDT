package com.phuongnta2008110300.Lab2;

import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập a: ");
            int a = scanner.nextInt();
            System.out.print("Nhập b: ");
            int b = scanner.nextInt();
            if(a==0)
                if(b==0)
                    System.out.println("PT vô số nghiệm.");
                else
                    System.out.println("PT vô nghiệm.");
            else
                System.out.println("PT có nghiệm duy nhất: x = "+(-b/a));
        
    }
}
