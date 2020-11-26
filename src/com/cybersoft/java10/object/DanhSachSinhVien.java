package com.cybersoft.java10.object;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
	ArrayList<SinhVien> alSinhVien;

	public ArrayList<SinhVien> getAlSinhVien() {
		return alSinhVien;
	}

	public void setAlSinhVien(ArrayList<SinhVien> alSinhVien) {
		this.alSinhVien = alSinhVien;
	}

	public DanhSachSinhVien() {
		alSinhVien = new ArrayList<SinhVien>();
	}

	public void nhap(Scanner s) {
		for (SinhVien sinhVien : alSinhVien) {
			sinhVien.nhap(s);
		}
	}

	public void themSV(SinhVien sv) {
		this.alSinhVien.add(sv);
	}

	public void xuat() {
		for (SinhVien sinhVien : alSinhVien) {
			sinhVien.xuat();
		}
	}

	public void tinhDiemTrungBinh() {
		for (SinhVien sinhVien : alSinhVien) {
			sinhVien.tinhDiemTrungBinh();
		}
	}

	public void xepLoai() {
		for (SinhVien sinhVien : alSinhVien) {
			sinhVien.xepLoai();
		}
	}

	public ArrayList<SinhVien> timSVCoDTBCaoNhat() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		SinhVien svMax = this.alSinhVien.get(0);
		SinhVien svDangDuyet;
		int viTriMaxDauTien = 0;
		for (int i = 0; i < this.alSinhVien.size(); i++) {
			svDangDuyet = this.alSinhVien.get(i);
			if (svDangDuyet.getDtb() > svMax.getDtb()) {
				svMax = svDangDuyet;
				viTriMaxDauTien = i;
			}
		}
		list.add(svMax);
		for (int i = viTriMaxDauTien + 1; i < this.alSinhVien.size(); i++) {
			svDangDuyet = this.alSinhVien.get(i);
			if (svDangDuyet.getDtb() == svMax.getDtb()) {
				list.add(svDangDuyet);
			}
		}
		return list;
	}

	public ArrayList<SinhVien> timSVYeu() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		for (SinhVien sinhVien : this.alSinhVien) {
			if (sinhVien.getXepLoai().equalsIgnoreCase("Yếu")) {
				list.add(sinhVien);
			}else {
				System.out.println("Không tim thấy sinh viên yếu trong danh sách");
			}
		}
		return list;
	}

	public ArrayList<SinhVien> timSVTheoTen(String ten) {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		for (SinhVien sinhVien : alSinhVien) {
			if (sinhVien.getTen().equalsIgnoreCase(ten)) {
					list.add(sinhVien);					
			}else {
				System.out.println("Không tim thấy tên sinh viên trong danh sách");
			}
		}
		return list;
	}
	
	public SinhVien timSVTheoMa(String ma) {
		SinhVien sv = null;
		for (SinhVien sinhVien : alSinhVien) {
			if(sinhVien.getMa().equalsIgnoreCase(ma)) {
				sv = sinhVien;
				break;
			}
		}
		return sv;
	}
	
	public boolean xoaSVTheoMa(String ma) {
		boolean del = false;
		for (SinhVien sinhVien : alSinhVien) {
			if(sinhVien.getMa().equalsIgnoreCase(ma)) {
				this.alSinhVien.remove(sinhVien);
				del = true;
			}
		}
		return del;
	}
	public void xuatHelper(ArrayList<SinhVien> list) {
		for (SinhVien sinhVien : list) {
			sinhVien.xuat();
		}
	}
}
