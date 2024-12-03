package baitap;
import java.util.Scanner;
import java.util.Arrays;
public class bai3 {
	public static void main(String[] args) {
		int n, i, j, temp;
		System.out.println("Nhap vao so phan tu trong mang: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[] array= new int [n];
        System.out.println("Nhap vao cac phan tu trong mang: ");
        for(i=0; i<array.length; i++) {
        	array[i]= sc.nextInt();
        }
        System.out.println("Mang truoc khi sap xep: " +Arrays.toString(array));
        temp= array[0];
        for(i=0; i<array.length-1; i++) {
        	for(j=i+1; j<array.length; j++) {
        		if(array[i]>array[j]) {
        			temp= array[i];
        			array[i]= array[j];
        			array[j]= temp;
        		}
        	}
        }
        System.out.println("Mang sau khi sap xep theo thu tu tang dan: " +Arrays.toString(array));
	}
}
