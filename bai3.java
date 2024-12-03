package baitap;
import java.util.Scanner;
public class bai3 {
	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap lan luot a, b, c: ");
		a= sc.nextDouble();
		b= sc.nextDouble();
		c= sc.nextDouble();
		
		if(a!=0)
		{
			delta= b*b-4*a*c;
			if(delta>0)
			{
				System.out.println("Phuong trinh co hai nghiem phan biet");
				x1= (-b+Math.sqrt(delta))/(2*a);
				System.out.println("x1= "+x1);
				x2= (-b-Math.sqrt(delta))/(2*a);
				System.out.println("x2= "+x2);
			}
			if(delta==0)
			{
				System.out.println("Phuong trinh co nghiem kep");
				x1=x2= -b/(2*a);
				System.out.println("x1=x2= "+x1);
			}
			if(delta<0)
				System.out.println("Phuong trinh vo nghiem");
		}
		if(a==0)
		{
			System.out.println("Phuong trinh co nghiem duy nhat");
			x1= -c/b;
			System.out.println("x= "+x1);
		}
	}
}
