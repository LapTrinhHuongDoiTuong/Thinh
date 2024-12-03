package baitap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class bai6 {
	public static void main(String[] args) {
		int n, i, x, y, z;
		boolean trl;
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
        System.out.println("Ban co muon them, xoa phan tu trong danh sach khong?: true/false?");
        trl= sc.nextBoolean();
        if(trl) {
        	System.out.println("Moi ban chon: 1.Them, 2.Xoa");
        	x= sc.nextInt();
        	if(x==1) {
        		System.out.println("Ban muon them phan tu gi vao vi tri nao?");
        		System.out.println("Nhap vi tri: ");
        		y= sc.nextInt();
        		System.out.println("Nhap phan tu: ");
        		z= sc.nextInt();
        		list.add(y, z);
        		System.out.println("Danh sach sau khi them: "+list);
        	}
        	if(x==2) {
        		System.out.println("Ban muon xoa phan tu o vi tri nao?");
        		System.out.println("Nhap vi tri: ");
        		y= sc.nextInt();
        		list.remove(y);
        		System.out.println("Danh sach sau khi xoa: "+list);
        	}
        }
        else
        	System.out.println("Ket thuc");
	}
}
