package bai2;
import java.util.Scanner;
public class SinhVien {
	public String maSV;
	public String tenSV;
	public String ngSinh;
	public double diemTB;
	
	public void Nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ma sinh vien: ");
		maSV= sc.nextLine();
		System.out.println("Nhap ten sinh vien: ");
		tenSV= sc.nextLine();
		System.out.println("Nhap ngay sinh (dd/mm/yyyy): ");
		ngSinh= sc.nextLine();
		System.out.println("Nhap diem trung binh: ");
		diemTB= sc.nextDouble();
	}
	public void Xuat()
	{
		System.out.println("Ma sinh vien: "+maSV);
		System.out.println("Ten sinh vien: "+tenSV);
		System.out.println("Ngay sinh: "+ngSinh);
		System.out.println("Diem trung binh: "+diemTB);
	}
}
