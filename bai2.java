package baitap;
import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		double diemtb;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap diem trung binh: ");
		diemtb= sc.nextDouble();
		
		if(diemtb>=8.0)
			System.out.println("Gioi");
		if(diemtb>=6.5 && diemtb<8.0)
			System.out.println("Kha");
		if(diemtb>=5.0 && diemtb<6.5)
			System.out.println("Trung binh");
		if(diemtb>3.5 && diemtb<5.0)
			System.out.println("Yeu");
	}
}
