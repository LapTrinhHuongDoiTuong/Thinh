package baitap;
import java.util.Scanner;
import java.util.Arrays;
public class bai2 {
	public static void main(String[] args){
		int n, i, temp;
		System.out.println("Nhap vao so phan tu trong mang: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[] array= new int [n];
        System.out.println("Nhap vao cac phan tu trong mang: ");
        for(i=0; i<array.length; i++) {
        	array[i]= sc.nextInt();
        }
        System.out.println("Mang truoc khi dao nguoc: " +Arrays.toString(array));
        for(i=0; i<array.length/2; i++) {
        	temp=array[i];
        	array[i]=array[array.length-i-1];
        	array[array.length-i-1]=temp;
        }
        System.out.println("Mang sau khi dao nguoc: " +Arrays.toString(array));
	}
}
