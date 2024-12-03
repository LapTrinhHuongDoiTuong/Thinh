package baitap;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
		int n, i;
		boolean trl= true;
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        n= sc.nextInt();
        
        if(n<2)
        	trl= false;
        else {
        	for(i=2; i<=n-1; i++) {
        		if(n%i==0)
        			trl= false;
        		    break;
        	}
        }
        if(trl)
        	System.out.printf("%d la so nguyen to",n);
        else
        	System.out.printf("%d khong phai la so nguyen to",n);
	}
}
