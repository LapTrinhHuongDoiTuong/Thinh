package baitap;
import java.util.Scanner;
public class bai3 {
	public static void main(String[] args) {
		int n, i;
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        n= sc.nextInt();
        int gt=1;
        if(n==0||n==1)
        	gt=1;
        else {
        	for(i=2; i<=n; i++) {
        		gt*=i;
        	}	
        }
        System.out.printf("Giai thua cua %d la: %d",n,gt);
	}
}
