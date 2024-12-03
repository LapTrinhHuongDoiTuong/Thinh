package baitap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class bai5 {
	public static void main(String[] args) {
		int n, i;
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Nhap vao so phan tu trong danh sach: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int value;
        System.out.println("Nhap vao cac phan tu trong danh sach: ");
        for(i=0; i<n; i++) {
        	value= sc.nextInt();
        	list.add(value);
        }
        System.out.println("Danh sach: "+list);
	}
}
