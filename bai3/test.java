package bai3;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		TaiKhoan tk= new TaiKhoan();
		Scanner sc= new Scanner(System.in);
		tk.nhapThongtin();
		System.out.println("Ban muon: ");
		System.out.println("1. Gui tien");
		System.out.println("2. Rut tien");
		System.out.println("3. Kiem tra so du");
		System.out.println("0. Thoat");
		int n;
		do {
			System.out.println("Moi ban chon: ");
			n= sc.nextInt();
			switch(n) {
			case 1:
				tk.guiTien();
				break;
			case 2:
				tk.rutTien();
				break;
			case 3:
				tk.checksoDu();
				break;
			case 0:
				System.out.println("Thoat");
				break;
			default:
				System.out.println("Lua chon khong hop le!");
			}
		}
		while(n!=0);
	}
}