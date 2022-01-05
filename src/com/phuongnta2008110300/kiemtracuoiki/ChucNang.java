package com.phuongnta2008110300.kiemtracuoiki;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class ChucNang {
	private ArrayList<HangHoa> danhSach;
	private SimpleDateFormat sdf;
	DecimalFormat df;
	Scanner sc = new Scanner(System.in);
	
	public ChucNang() {
		danhSach = new ArrayList<>();
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		df = new DecimalFormat("#,###,000");
	}
	
	public void themHangHoa() throws Exception {
		
		HangHoa sp = new HangHoa();
		
		System.out.print("Nhap ma hang: ");
		String ma = sc.nextLine();
		while(isTrungMa(ma, danhSach)) {
			System.out.print("Nhap lai ma hang: ");
			ma = sc.nextLine();
		}
		sp.setMaHang(ma);
		
		System.out.print("Nhap ten hang: ");
		String ten = sc.nextLine();
		sp.setTenHang(ten);
		
		System.out.print("Nhap gia hang: ");
		String gia = sc.nextLine();
		sp.setGiaNhap(Double.parseDouble(gia));
		
		System.out.print("Nhap so luong ton: ");
		String soLuongTon = sc.nextLine();
		sp.setSoLuongTon(Integer.parseInt(soLuongTon));
		
		System.out.print("Nhap loai hang (1 trong 3 : Thuc pham, Sanh su, Dien may): ");
		String loai = sc.nextLine();
		sp.setLoaiHang(loai);
		
		System.out.print("Nhap ngay nhap hang (vd : ngay/thang/nam): ");
		String ngayNhap = sc.nextLine();
		Date _ngayNhap = sdf.parse(ngayNhap);
		sp.setNgayNhap(_ngayNhap);
		
		danhSach.add(sp);
		System.out.println("Nhap thanh cong hang hoa: " + sp.toString());
		System.out.println("==============================================================================");
	}
	
	private boolean isTrungMa(String ma, ArrayList<HangHoa> danhSach) {
		for(HangHoa sp : danhSach) {
			if(sp.getMaHang().equals(ma))
				return true;
		}
		
		return false;
	}
	
	public void xuatDanhSachHangHoa() {
		tieuDe();
		for(HangHoa hh : danhSach) {
			System.out.println(hh.toString());
		}
		System.out.println("==============================================================================");
	}
	
	private void tieuDe() {
		System.out.printf("%-10s %-15s %-10s %-10s %-15s %-20s\n", 
				"Ma Hang", "Ten Hang", "Gia Nhap", "SL Ton", "Loai Hang", "Ngay Nhap");
	}
	
	public void xoaHangHoa() {
		System.out.print("Nhap ma hang hoa muon xoa: ");
		String ma = sc.nextLine();
		
		for(HangHoa hh : danhSach) {
			if(hh.getMaHang().equals(ma)) {
				danhSach.remove(hh);
				System.out.println("Xoa thanh cong hang hoa: " + ma);
				return;
			}
			
		}
		System.out.println("Khong tim thay hang hoa nay!");
		System.out.println("==============================================================================");
	}
	
	public void suaHangHoa() throws ParseException {
		System.out.print("Nhap ma hang hoa muon sua: ");
		String ma = sc.nextLine();
		boolean isSua = false;
		
		for(HangHoa hh : danhSach) {
			if(hh.getMaHang().equals(ma)) {
				System.out.println("Lua chon sua:");
				System.out.println("1. Sua ten hang hoa");
				System.out.println("2. Sua gia hang hoa");
				System.out.println("3. Sua so luong ton");
				System.out.println("4. Sua ngay nhap kho");
				
				System.out.print("Nhap lua chon: ");
				int chon = sc.nextInt();
				sc.nextLine();
				
				if(chon == 1) {
					System.out.print("Nhap ten hang: ");
					String ten = sc.nextLine();
					hh.setTenHang(ten);
					isSua = true;
				}
				else if(chon == 2) {
					System.out.print("Nhap gia hang : ");
					String gia = sc.nextLine();
					hh.setGiaNhap(Double.parseDouble(gia));
					isSua = true;
				}
				else if(chon == 3) {
					System.out.print("Nhap so luong ton: ");
					String soLuongTon = sc.nextLine();
					hh.setSoLuongTon(Integer.parseInt(soLuongTon));
					isSua = true;
				}
				else if(chon == 4) {
					System.out.print("Nhap ngay nhap hang : ");
					String ngayNhap = sc.nextLine();
					Date _ngayNhap = sdf.parse(ngayNhap);
					hh.setNgayNhap(_ngayNhap);
					isSua = true;
				}
				else {
					System.out.println("Khong co lua chon nay!");
					return;
				}
			}
		}
		
		if(!isSua) {
			System.out.println("Khong tim thay hang hoa de sua!");
		}
		
		System.out.println("==============================================================================");
	}
	
	public void timKiem() throws ParseException {
		System.out.println("Lua chon tim kiem:");
		System.out.println("1. Tim theo loai");
		System.out.println("2. Tim theo khoang gia");
		System.out.println("3. Tim theo ngay nhap");
		
		System.out.print("Nhap lua chon: ");
		int chon = sc.nextInt();
		sc.nextLine();
		
		if(chon == 1) {
			System.out.print("Nhap loai hang muon tim: ");
			String loaiHang = sc.nextLine();
			timKiemTheoLoai(loaiHang);
		}
		else if(chon == 2) {
			System.out.print("Nhap gia khoi dau: ");
			double giaDau = sc.nextDouble();
			System.out.print("Nhap gia cuoi cung: ");
			double giaCuoi = sc.nextDouble();
			timKiemTheoGia(giaDau, giaCuoi);
		}
		else if(chon == 3) {
			System.out.print("Nhap ngay dau: ");
			String ngayDau = sc.nextLine();
			Date _ngayDau = sdf.parse(ngayDau);
			
			System.out.print("Nhap ngay cuoi: ");
			String ngayCuoi = sc.nextLine();
			Date _ngayCuoi = sdf.parse(ngayCuoi);
			
			timKiemTheoNgay(_ngayDau, _ngayCuoi);
		}
		else {
			System.out.println("Lua chon khong hop le!");
		}
		
		System.out.println("==============================================================================");
	}
	
	private void timKiemTheoLoai(String loaiHang) {
		tieuDe();
		
		for(HangHoa hh : danhSach) {
			if(hh.getLoaiHang().equals(loaiHang)) {
				System.out.println(hh.toString());
			}
		}
	}
	
	private void timKiemTheoGia(double giaDau, double giaCuoi) {
		tieuDe();
		
		for(HangHoa hh : danhSach) {
			if(hh.getGiaNhap() > giaDau && hh.getGiaNhap() < giaCuoi) {
				System.out.println(hh.toString());
			}
		}
	}
	
	private void timKiemTheoNgay(Date ngayDau, Date ngayCuoi) {
		tieuDe();
		
		for(HangHoa hh : danhSach) {
			if(hh.getNgayNhap().after(ngayDau) && hh.getNgayNhap().before(ngayCuoi)) {
				System.out.println(hh.toString());
			}
		}
	}
	
	public void initData() throws ParseException {
		danhSach.add(new HangHoa("DM001", "Quat dien"       , 250000	, 150	, "Dien may"	, sdf.parse("22/10/2020")));
		danhSach.add(new HangHoa("TP002", "Trai cay"		, 300000	, 1000	, "Thuc pham"	, sdf.parse("10/6/2020")));
		danhSach.add(new HangHoa("DM003", "Binh acquy"		, 200000	, 70	, "Dien may"	, sdf.parse("30/11/2020")));
		danhSach.add(new HangHoa("SS004", "Chen su"			, 500000	, 120	, "Sanh su"		, sdf.parse("15/9/2019")));
		danhSach.add(new HangHoa("DM005", "Ti vi"			, 250000	, 350	, "Dien may"	, sdf.parse("12/8/2020")));
		danhSach.add(new HangHoa("TP0023", "Thit bo"		, 300000	, 560	, "Thuc pham"	, sdf.parse("9/10/2020")));
		danhSach.add(new HangHoa("DM003", "Tu lanh"			, 200000	, 770	, "Dien may"	, sdf.parse("14/1/2020")));
		danhSach.add(new HangHoa("SS001", "Noi com"			, 500000	, 30	, "Sanh su"		, sdf.parse("5/12/2019")));
		danhSach.add(new HangHoa("DM002", "May lanh"		, 250000	, 100	, "Dien may"	, sdf.parse("18/2/2020")));
		danhSach.add(new HangHoa("TP0022", "Tom"			, 300000	, 2300	, "Thuc pham"	, sdf.parse("5/7/2020")));
		danhSach.add(new HangHoa("DM0030", "Dong co xe"		, 200000	, 700	, "Dien may"	, sdf.parse("26/5/2020")));
		danhSach.add(new HangHoa("SS0046", "Bat com"		, 500000	, 230	, "Sanh su"		, sdf.parse("15/3/2019")));
		danhSach.add(new HangHoa("DM0019", "May loc nuoc"	, 250000	, 650	, "Dien may"	, sdf.parse("2/2/2020")));
		danhSach.add(new HangHoa("TP0028", "Rau"			, 300000	, 890	, "Thuc pham"	, sdf.parse("17/8/2020")));
		danhSach.add(new HangHoa("DM0037", "Laptop"			, 200000	, 90	, "Dien may"	, sdf.parse("10/8/2020")));
		danhSach.add(new HangHoa("SS0043", "Binh nuoc"		, 500000	, 330	, "Sanh su"		, sdf.parse("15/12/2020")));
		danhSach.add(new HangHoa("DM0012", "Loa BlueTooth"	, 250000	, 180	, "Dien may"	, sdf.parse("22/4/2019")));
		danhSach.add(new HangHoa("TP00211", "Com chay"		, 300000	, 220	, "Thuc pham"	, sdf.parse("10/6/2020")));
		danhSach.add(new HangHoa("DM0032", "May dieu hoa"	, 200000	, 70	, "Dien may"	, sdf.parse("10/7/2019")));
		danhSach.add(new HangHoa("SS0043", "Be ca"			, 500000	, 400	, "Sanh su"		, sdf.parse("15/9/2019")));
	}
	
	public void sapXep() {
		System.out.println("Lua chon: ");
		System.out.println("1. Sap xep tang dan");
		System.out.println("2. Sap xep giam dan");
		
		System.out.print("Nhap lua chon: ");
		int chon = sc.nextInt();
		sc.nextLine();
		
		if(chon == 1) {
			System.out.println("Lua chon: ");
			System.out.println("1. Sap xep tang dan theo gia nhap");
			System.out.println("2. Sap xep tang dan theo ngay nhap");
			
			System.out.print("Nhap lua chon: ");
			int chon1 = sc.nextInt();
			sc.nextLine();
			
			if(chon1 == 1) {
				sapXepTangDanTheoGia();
			}
			else if(chon1 == 2) {
				sapXepTangDanTheoNgay();
			}
			else {
				System.out.println("Khong co lua chon nay!");
			}
		}
		else if(chon == 2) {
			System.out.println("Lua chon: ");
			System.out.println("1. Sap xep giam dan theo gia nhap");
			System.out.println("2. Sap xep giam dan theo ngay nhap");
			
			System.out.print("Nhap lua chon: ");
			int chon2 = sc.nextInt();
			sc.nextLine();
			
			if(chon2 == 1) {
				sapXepGiamDanTheoGia();
			}
			else if(chon2 == 2) {
				sapXepGiamDanTheoNgay();
			}
			else {
				System.out.println("Khong co lua chon nay!");
			}
		}
		else {
			System.out.println("Khong co lua chon nay!");
		}
	}
	
	private void sapXepTangDanTheoGia() {
		Collections.sort(danhSach, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return (int) (o1.getGiaNhap() - o2.getGiaNhap());
			}
		});
		
		xuatDanhSachHangHoa();
	}
	
	private void sapXepTangDanTheoNgay() {
		Collections.sort(danhSach, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return (int) (o1.getNgayNhap().compareTo(o2.getNgayNhap()));
			}
		});
		
		xuatDanhSachHangHoa();
	}
	
	private void sapXepGiamDanTheoGia() {
		Collections.sort(danhSach, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return (int) (o2.getGiaNhap() - o1.getGiaNhap());
			}
		});
		
		xuatDanhSachHangHoa();
	}
	
	private void sapXepGiamDanTheoNgay() {
		Collections.sort(danhSach, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return (int) (o2.getNgayNhap().compareTo(o1.getNgayNhap()));
			}
		});
		
		xuatDanhSachHangHoa();
	}
	
	public void thongKeHangHoa() {
		double tongGiaTri = 0;
		int demThucPham = 0;
		int demSanhSu = 0;
		int demDienMay = 0;
		
		for(HangHoa hh : danhSach) {
			tongGiaTri += hh.getGiaNhap();
			if(hh.getLoaiHang().equals("Dien may")) 
				demDienMay++;
			if(hh.getLoaiHang().equals("Sanh su"))
				demSanhSu++;
			if(hh.getLoaiHang().equals("Thuc pham"))
				demThucPham++;
		}
		
		System.out.println("Tong so luong hang hoa: " + danhSach.size());
		System.out.println("Tong gia tri nhap kho: " + df.format(tongGiaTri));
		System.out.println("So luong hang hoa[Dien may]: " + demDienMay);
		System.out.println("So luong hang hoa[Sanh su]: " + demSanhSu);
		System.out.println("So luong hang hoa[Thuc pham]: " + demThucPham);
		System.out.println("==============================================================================");
	}
}
