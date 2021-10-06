package com.phuongnta2008110300.Lab2;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào hệ số b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập vào hệ số c: ");
        int c = scanner.nextInt();
        if(a==0)
            System.out.println("PT bậc nhất ");
        else
        {
            double delta = Math.pow(b,2) - 4*a*c;
            if(delta<0)
                System.out.println("PT vô nghiệm ");
            else
                if(delta==0)
                    System.out.println("\nPT có nghiệm kép x1 = x2 = "+(-b/2*a));
                else 
                {
                    System.out.println("PT có 2 nghiệm phân biệt: ");
                    System.out.printf("x1 = %.2f\n",((-b+Math.sqrt(delta))/(2*a)));
                    System.out.printf("x2 = %.2f.",((-b-Math.sqrt(delta))/(2*a)));
                }
        }
    }
  
}

