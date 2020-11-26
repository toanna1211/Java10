package com.cybersoft.java10.object;

import java.util.Scanner;

public class SinhVien {
	private String ten;
	private String ma;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float dtb;
	private String xepLoai;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDtb() {
		return dtb;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public SinhVien() {

	}

	public SinhVien(String ten, String ma, float diemToan, float diemLy, float diemHoa) {
		this.ten = ten;
		this.ma = ma;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public void nhap(Scanner s) {
		System.out.println("Nhập mã: ");
		ma = s.nextLine();

		System.out.println("Nhập tên: ");
		ten = s.nextLine();

		System.out.println("Nhập điểm Toán: ");
		diemToan = Float.parseFloat(s.nextLine());

		System.out.println("Nhập điểm Lý: ");
		diemLy = Float.parseFloat(s.nextLine());

		System.out.println("Nhập điểm Hóa: ");
		diemHoa = Float.parseFloat(s.nextLine());

	}

	@Override
	public String toString() {
		return "SinhVien [ten=" + ten + ", ma=" + ma + ", diemToan=" + diemToan + ", diemLy=" + diemLy + ", diemHoa="
				+ diemHoa + ", dtb=" + dtb + ", xepLoai=" + xepLoai + "]";
	}

	public void xuat() {
		System.out.println(toString());
	}

	public void tinhDiemTrungBinh() {
		this.dtb = (diemToan + diemHoa + diemLy) / 3;
	}

	public void xepLoai() {
		if (this.dtb >= 9) {
			this.xepLoai = "Xuất sắc";
		} else if (this.dtb >= 8) {
			this.xepLoai = "Giỏi";
		} else if (this.dtb >= 7) {
			this.xepLoai = "Khá";
		} else if (this.dtb >= 6) {
			this.xepLoai = "Trung bình - Khá";
		} else if (this.dtb >= 5) {
			this.xepLoai = "Trung Bình";
		} else {
			this.xepLoai = "Yếu";
		}
	}
}
