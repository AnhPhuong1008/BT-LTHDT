package com.phuongnta2008110300.kiemtragiuaki;

public class Nguoi {
    private String hoTen;
    private String diaChi;
    Nguoi(String hoTen,String diaChi){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    public String toString() {
        return hoTen+ " " +diaChi;
    }
}

