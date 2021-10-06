package com.phuongnta2008110300.Lab3;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên tố N: ");
        int N = input.nextInt();
        boolean ok = true;
        for(int i=2;i<N-1;i++)
            if(N%i==0)
            {
                ok = false;
                break;
            }
        if(ok ==true)
            System.out.println("N là số nguyên tố");
        else 
            System.out.println("N không là số nguyên tố");
    }
}
