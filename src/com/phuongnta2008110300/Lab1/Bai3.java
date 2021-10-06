package com.phuongnta2008110300.Lab1;

import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh khối lập phương: ");
        double Canh = scanner.nextDouble();
        double theTich = Canh * Canh * Canh;
        System.out.printf("%f",theTich);
    }
}
