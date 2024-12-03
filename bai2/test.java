package bai2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<SinhVien> dssv = new ArrayList<>();
		System.out.println("Nhap so luong sinh vien: ");
		int n= sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Nhap thong tin sinh vien thu" +(i+1)+": ");
			SinhVien sv= new SinhVien();
			sv.Nhap();
			dssv.add(sv);
		}
		Collections.sort(dssv, new Comparator<SinhVien>() {
			public int compare(SinhVien sv1, SinhVien sv2) {
				return Double.compare(sv2.diemTB, sv1.diemTB);
			}
		});
		System.out.println("Danh sach sinh vien: ");
		for(SinhVien sv : dssv) {
			sv.Xuat();
		}
	}
}
