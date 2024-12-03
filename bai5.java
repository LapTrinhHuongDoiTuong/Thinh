package baitap;
import java.util.Scanner;
public class bai5 {
	public static void main(String[] args) {
		double a, b, c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap lan luot ba canh cua tam giac a, b, c: ");
		a= sc.nextDouble();
		b= sc.nextDouble();
		c= sc.nextDouble();
		
		if((a+b>c)&&(a+c>b)&&(b+c>a)&&(a>0)&&(b>0)&&(c>0))
		{
			if((a==b) && (b==c))
				System.out.println("Tam giac deu");
			else if((a==b)||(a==c)||(b==c))
				System.out.println("Tam giac can");
			else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a))
				System.out.println("Tam giac vuong");
			else
				System.out.println("Tam giac thuong");
		}
		else
			System.out.println("Khong phai la tam giac");
	}
}
