package baitap;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap lan luot ba so a, b, c: ");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		if(a<=b && a<=c)
			System.out.println("So nho nhat la: "+a);
		else if(b<=a && b<=c)
			System.out.println("So nho nhat la: "+b);
		else
			System.out.println("So nho nhat la: "+c);
	}
}
