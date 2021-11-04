package com.phuongnta2008110300.kiemtragiuaki;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double triGiaHoaDon;
    KhachHang(String hoTen,String diaChi,String tenCongTy,double triGiaHoaDon){
        super(hoTen,diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }
    public String toString() {
        return super.toString()+ " " +tenCongTy+ " " +triGiaHoaDon;
    }

}
