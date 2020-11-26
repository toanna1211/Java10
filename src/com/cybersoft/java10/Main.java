package com.cybersoft.java10;

import java.util.ArrayList;
import java.util.Scanner;

import com.cybersoft.java10.object.DanhSachSinhVien;
import com.cybersoft.java10.object.SinhVien;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		xuLyMenu(s, dssv);
		s.close();
	}

	public static void inMenu() {
		System.out.println("1. Thêm sinh viên");
		System.out.println("2. Xuất");
		System.out.println("3. Tìm sinh viên có điểm trung bình cao nhất");
		System.out.println("4. Tìm sinh viên yếu");
		System.out.println("5. Tìm sinh viên theo tên");
		System.out.println("6. Tìm sinh viên theo mã");
		System.out.println("7. Xóa sinh viên theo mã");
		System.out.println("0. Dừng");
	}

	public static void xuLyMenu(Scanner s, DanhSachSinhVien dssv) {
		boolean flag = true;
		ArrayList<SinhVien> list;
		do {
			inMenu();
			System.out.println("Mời chọn: ");
			byte chon = Byte.parseByte(s.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(s);
				dssv.themSV(sv);
				dssv.tinhDiemTrungBinh();
				dssv.xepLoai();
				break;
			case 2:
				dssv.xuat();
				break;
			case 3:
				list = dssv.timSVCoDTBCaoNhat();
				dssv.xuatHelper(list);
				break;
			case 4:
				list = dssv.timSVYeu();
				if (list != null) {
					dssv.xuatHelper(list);
				} else {
					System.out.println("Danh sách không có sinh viên Yếu");
				}
				break;
			case 5:
				System.out.println("Nhập tên muốn tìm: ");
				String ten = s.nextLine();
				list = dssv.timSVTheoTen(ten);
				dssv.xuatHelper(list);
				break;
			case 6:
				System.out.println("Nhập mã muốn tìm: ");
				String ma = s.nextLine();
				SinhVien maSV = dssv.timSVTheoMa(ma);
				if(maSV != null) {
					maSV.xuat();
				}else {
					System.out.println("Không tìm thấy mã sinh viên trong danh sách");
				}
				break;
			case 7:
				System.out.println("Nhập mã muốn xóa: ");
				String maXoa = s.nextLine();
				boolean del = dssv.xoaSVTheoMa(maXoa);
				if(del) {
					System.out.println("Xóa thành công");
				}else {
					System.out.println("Xóa không thành công ! Chưa tìm thấy mã sinh viên cần xóa");
				}
				break;
			case 0:
				flag = false;
				break;
			default:
				break;
			}
		} while (flag);
	}
}
