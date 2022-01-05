package com.phuongnta2008110300.kiemtracuoiki;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangHoa{
	private String maHang;
	private String tenHang;
	private double giaNhap;
	private int soLuongTon;
	private String loaiHang;
	private Date ngayNhap;
	
	
	
	public HangHoa() {
		
	}


	public HangHoa(String maHang, String tenHang, double giaNhap, int soLuongTon, String loaiHang, Date ngayNhap) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.giaNhap = giaNhap;
		this.soLuongTon = soLuongTon;
		this.loaiHang = loaiHang;
		this.ngayNhap = ngayNhap;
	}


	public String getMaHang() {
		return maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public double getGiaNhap() {
		return giaNhap;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public String getLoaiHang() {
		return loaiHang;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}



	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	public void setLoaiHang(String loaiHang) throws Exception {
		if(loaiHang.equals("Thuc pham") || loaiHang.equals("Sanh su") || loaiHang.equals("Dien may"))
			this.loaiHang = loaiHang;
		else
			throw new Exception("Loai hang khong ton tai!");
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}


	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###,000");
		return String.format("%-10s %-15s %-10s %-10d %-15s %-20s",
				this.getMaHang(), this.getTenHang(), df.format(this.getGiaNhap()), this.getSoLuongTon(), this.getLoaiHang(), sdf.format(getNgayNhap()));
	}
	
	
}