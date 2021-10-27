package com.phuongnta2008110300.lab5;
import java.util.Scanner;
public class TestNhanVien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NhanVien nhanVien = new NhanVien("Nguyễn Trần Anh Phương");
        NhanVien.ImportAddress("tinh lo 43");
        NhanVien.ImportBirthday("01/03/2002");
        NhanVien.ImportPosition("IT");
        NhanVien.ImportSalary(2000);
        NhanVien.showData();
    }
}
