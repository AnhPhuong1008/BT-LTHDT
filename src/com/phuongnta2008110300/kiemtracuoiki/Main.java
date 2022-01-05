package com.phuongnta2008110300.kiemtracuoiki;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		ChucNang cn = new ChucNang();
		Scanner sc = new Scanner(System.in);
		
		cn.initData();
		
		while(true) {
			System.out.println("Danh sach chuc nang:");
			System.out.println("1. Them hang hoa");
			System.out.println("2. Sua hang hoa");
			System.out.println("3. Xoa hang hoa");
			System.out.println("4. Xem danh sach hang hoa");
			System.out.println("5. Tim kiem hang hoa");
			System.out.println("6. Sap xep hang hoa");
			System.out.println("7. Thong ke hang hoa");
			System.out.println("8. Thoat");
			System.out.print("Nhap lua chon: ");
			int chon = sc.nextInt();
			
			switch (chon) {
			case 1: {
				cn.themHangHoa();
			}break;
			
			case 2: {
				cn.suaHangHoa();
			}break;
			
			case 3: {
				cn.xoaHangHoa();
			}break;
			
			case 4: {
				cn.xuatDanhSachHangHoa();
			}break;
			
			case 5: {
				cn.timKiem();
			}break;
			
			case 6: {
				cn.sapXep();
			}break;
			
			case 7: {
				cn.thongKeHangHoa();
			}break;
			
			case 8: {
				System.out.println("Cam on da su dung!");
				return;
			}
			
			default:
				System.out.println("Lua chon khong hop le!");
			}
		}
	}
}
