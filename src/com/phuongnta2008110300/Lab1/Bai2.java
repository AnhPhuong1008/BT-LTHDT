package com.phuongnta2008110300.Lab1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Chiều rộng: "); 
        double chieuRong = scanner.nextDouble();
        double chuVi = (chieuDai + chieuRong)*2;
        double dienTich = chieuDai * chieuRong;
        double canhNhoNhat = Math.min(chieuDai, chieuRong);
        System.out.printf("%f",chuVi);
        System.out.printf("%f",dienTich);
        System.out.printf("%f",canhNhoNhat);

    }
}
