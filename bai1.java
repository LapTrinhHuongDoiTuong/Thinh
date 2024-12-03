package baitap;
import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		int n, i;
		System.out.println("Nhap vao so phan tu trong mang: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[] array= new int [n];
        int tong=0;
        System.out.println("Nhap vao cac phan tu trong mang: ");
        for(i=0; i<array.length; i++) {
        	array[i]= sc.nextInt();
        }
        for(i=0; i<array.length; i++) {
        	tong= tong+array[i];
        }
        System.out.println("Ket qua la: "+tong);
	}
}
