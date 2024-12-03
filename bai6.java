package baitap;
import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
		int so, temp, sodn, sobd;
		sodn=0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        so= sc.nextInt();
        sobd=so;
        while(so!=0) {
        	temp= so%10;
        	sodn= sodn*10+temp;
        	so/=10;
        }
        if(sodn==sobd)
        	System.out.printf("%d la so doi xung",sobd);
        else
        	System.out.printf("%d khong phai la so doi xung",sobd);
	}
}
