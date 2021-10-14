package com.phuongnta2008110300.tuan5;
import java.util.Scanner;
public class MayTinh {
    String NhaSanXuat,HeDieuHanh,CPU,Gia;
    int NamSanXuat,ram,NamBaoHanh;
    MayTinh(){

    }
    void nhapThongTin(){       
        System.out.print("Nhập Nhà Sản Xuất: ");
        Scanner in= new Scanner(System.in);
        NhaSanXuat = in.nextLine();
    }
    void ShowCustomer(){      
        System.out.println("Tên khách hàng: " +NhaSanXuat);
    }
}
