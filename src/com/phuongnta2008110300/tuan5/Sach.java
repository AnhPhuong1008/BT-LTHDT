package com.phuongnta2008110300.tuan5;

public class Sach {
    int  gia,soluong,namxuatban;
    String nhaxuatban,loai;
    void SoLuong(int a){
        soluong = a;
    }
    void Gia(int a){
        gia = a;
    }
    void NhaXuatBan(String a){
        nhaxuatban = a;
    }
    void NamXuatBan(int a){
        namxuatban = a;
    }
    void Loai(String a){
        loai = a;
    }
    void showSach(){
        System.out.println("Nhà xuất bản: "+nhaxuatban);
        System.out.println("Năm xuất bản: "+namxuatban);
        System.out.println("Loại: "+loai);
        System.out.println("Giá: "+gia);
        System.out.println("Số lượng: "+soluong);
    }
}
