package baitap;
import java.util.Scanner;
public class bai5 {
	public static void main(String[] args) {
		int a, b, ucln=1, bcnn, i;
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hai so: ");
        a= sc.nextInt();
        b= sc.nextInt();
        
        for(i=1; i<=a && i<=b; i++) {
        	if(a%i==0 && b%i==0)
        		ucln=i;
        }
        System.out.printf("UCLN cua %d va %d la: %d", a, b, ucln);
        bcnn= (a*b)/ucln;
        System.out.printf("\nBCNN cua %d va %d la: %d", a, b, bcnn);
	}
}
