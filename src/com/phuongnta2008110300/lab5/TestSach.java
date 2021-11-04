package com.phuongnta2008110300.lab5;
import java.util.Scanner;
public class TestSach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sach sach = new Sach("Anh Phuong");
        Sach.Gia("300000");
        NhanVien.NamXuatBan("2002");
        NhanVien.NhaXuatBan("IT");
        NhanVien.SoLuong("20000");
        NhanVien.Loai("Loai A")
        NhanVien.showData();
    }
}
