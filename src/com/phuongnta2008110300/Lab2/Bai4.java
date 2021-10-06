package com.phuongnta2008110300.Lab2;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        System.out.println("1. Giai Phương trình bậc 1 ");
        System.out.println("2. Giai Phương trình bậc 2 ");
        System.out.println("3. Tính Tiền điện ");
        System.out.println("4. Kết thúc chương trình ");
        System.out.println("==================END=MENU=========================");

        System.out.print("Chọn chức năng bạn muốn:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        switch(x)
        {
            case 1: giaiPTBac1();; break;
            case 2: giaiPTBac2();; break;
            case 3: tinhTienDien();; break;
            default: System.out.println("Chọn chức năng khác");
        }
    }
    static void giaiPTBac1()
    {
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

    static void giaiPTBac2()
    {
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
    static void tinhTienDien()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số điện: ");
        int a = input.nextInt();
        if(a<50)
            System.out.println("Số tiền phải trả là: "+a*1000);
        else
            System.out.println("Tổng tiền phải trả:"+(a = 50*1000 + (a-50)*1200));
    }
}
