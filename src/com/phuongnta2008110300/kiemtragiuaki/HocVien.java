package com.phuongnta2008110300.kiemtragiuaki;

public class HocVien extends Nguoi{
    private float diemMonhoc1;
    private float diemMonhoc2;
    private static int soLuongHV;
    
    protected float diemTB(){
        return (diemMonhoc1+diemMonhoc2)/2;
    }


    HocVien(String hoTen,String diaChi,float diemMonhoc1,float diemMonhoc2){
        super(hoTen, diaChi);
        this.diemMonhoc1 = diemMonhoc1;
        this.diemMonhoc2 = diemMonhoc2;
    }
    public String toString() {
        return super.toString()+" "+diemMonhoc1+" "+diemMonhoc2+" "+" Diem trung binh "+diemTB();
    }
}
