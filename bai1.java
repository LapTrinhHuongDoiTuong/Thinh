package baitap;
import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		int n, i, tong;
		tong=0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        n= sc.nextInt();
        
        for(i=1; i<=n; i++)
        {
        	tong+=i;
        }
        System.out.println("Tong cac so tu 1 den n: "+tong);
	}
}
