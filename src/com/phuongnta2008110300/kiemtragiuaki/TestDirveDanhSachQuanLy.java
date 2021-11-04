package com.phuongnta2008110300.kiemtragiuaki;

public class TestDirveDanhSachQuanLy {
    public static void main(String[] args) {
        DanhSachQuanLy list = new DanhSachQuanLy();
        HocVien hocVien = new HocVien("anh phuong","96", 8,3);
        NhanVien nhanVien = new NhanVien("anh thu", "90", 6);
        KhachHang khachHang = new KhachHang("Anh vu", "9", "abc", 560);
        list.themNguoi(hocVien);
        list.themNguoi(khachHang);
        list.themNguoi(nhanVien);
        list.inList();
    }
}
