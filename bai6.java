package baitap;
import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
		int a, b;
		char pt;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap lan luot hai so a, b: ");
		a= sc.nextInt();
		b= sc.nextInt();
		
		System.out.println("Nhap vao phep toan: ");
		pt= sc.next().charAt(0);
		
			if(pt=='+')
				System.out.printf("%d+%d= %d ",a,b,a+b);
			if(pt=='-')
				System.out.printf("%d-%d= %d",a,b,a-b);
			if(pt=='*')
				System.out.printf("%d*%d= %d",a,b,a*b);
			if(pt=='/')
				System.out.printf("%d*1.0/%d= %f",a,b,a*1.0/b);
	}
}
