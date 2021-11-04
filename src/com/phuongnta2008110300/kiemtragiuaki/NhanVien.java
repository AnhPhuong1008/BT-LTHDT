package com.phuongnta2008110300.kiemtragiuaki;

public class NhanVien extends Nguoi{
    private float heSoLuong;
    protected float tinhLuong(){
        return heSoLuong*1500000;
    }
    NhanVien(String hoTen,String diaChi,float heSoLuong){
        super(hoTen,diaChi);
        this.heSoLuong = heSoLuong;
    }
    public String toString() {
        return super.toString()+" "+tinhLuong()+ " VND";
    }

}
