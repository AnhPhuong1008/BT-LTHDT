package com.phuongnta2008110300.lab1;

import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập a: ");
        double heSoa = scanner.nextDouble();
        System.out.print("nhập b: ");
        double heSob = scanner.nextDouble();
        System.out.print("nhập c: ");
        double heSoc = scanner.nextDouble();
        double delta = heSob*heSob - 4*heSoa*heSoc;
        double canDelta = Math.sqrt(delta);
        System.out.printf("%f",canDelta);
    }
}
