package baitap;
import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		int so;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so: ");
		so= sc.nextInt();
		
		if(so>0)
			System.out.println("La so duong");
		if(so<0)
			System.out.println("La so am");
		if(so==0)
			System.out.println("So 0");
	}
}
