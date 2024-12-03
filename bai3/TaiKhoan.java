package bai3;
import java.util.Scanner;
public class TaiKhoan {
	public String soTaiKhoan;
	public String tenTaiKhoan;
	public double soDu;
	Scanner sc= new Scanner(System.in);
	public void nhapThongtin() {
		System.out.println("Nhap so tai khoan: ");
		soTaiKhoan= sc.nextLine();
		System.out.println("Nhap ten tai khoan: ");
		tenTaiKhoan= sc.nextLine();
		System.out.println("So du ban dau: ");
		soDu= sc.nextDouble();
	}
	public void guiTien() {
		System.out.println("Ban muon gui bao nhieu tien?: ");
		double soTien= sc.nextDouble();
		if(soTien>0) {
			soDu+=soTien;
			System.out.println("Da gui: "+soTien+". So du hien tai: "+soDu);
		}
		else {
			System.out.println("So tien gui khong hop le!");
		}
	}
	public void rutTien() {
		System.out.println("Ban muon rut bao nhieu tien?: ");
		double soTien= sc.nextDouble();
		if(soTien>0 && soTien<=soDu) {
			soDu-=soTien;
			System.out.println("Da rut: "+soTien+". So du hien tai: "+soDu);
		}
		else {
			System.out.println("So tien rut khong hop le hoac vuot qua so du!");
		}
	}
	public void checksoDu() {
		System.out.println("So du hien tai: "+soDu);
	}
}