package baitap;
import java.util.Scanner;
import java.util.Arrays;
public class bai4 {
	public static void main(String[] args) {
		int n, i, j, count, max;
		System.out.println("Nhap vao so phan tu trong mang: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[] array= new int [n];
        int[] res= new int [n];
        System.out.println("Nhap vao cac phan tu trong mang: ");
        for(i=0; i<n; i++) {
        	array[i]= sc.nextInt();
        	res[i]= -1;
        }
        //tim so lan xuat hien cua cac phan tu
        for(i=0; i<n; i++) {
        	count=1;
        	for(j=i+1; j<n; j++) {
        		if(res[j]!=0 && array[i]==array[j]) {
        			count++;
        			res[j]=0;
        		}
        	}
        	if(res[i]!=0) {
        		res[i]=count;
        	}
        }
        //tim so lan xuat hien nhieu nhat
        max=res[0];
        for(i=0; i<n; i++) {
        	if(res[i]>max) {
        		max=res[i];
        	}
        }
        
        System.out.print("So lan xuat hien nhieu nhat: "+max+", Phan tu la: ");
        for(i=0; i<n; i++) {
        	if(res[i]==max) {
        		System.out.print(array[i]+", ");
        	}
        }
	}
}
