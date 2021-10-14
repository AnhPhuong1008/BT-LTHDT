package com.phuongnta2008110300.tuan5;

public class MainProject {
    private static String phuong;

    public static void main(String[] args) {
        Account2 account;
        MayTinh mayTinh;
        Cow cow;
        Sach sach;
        Xe xe;
        NhanVien nhanVien;

       
        account = new Account2(phuong,1234, 1000000);
        account.withdraw(500);
        account.showData();
    }
}
