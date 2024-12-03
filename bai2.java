package baitap;

public class bai2 {
	public static void main(String[] args) {
		int i, j;
		for(i=1; i<=10; i++) {
			for(j=1; j<=10; j++) {
				System.out.format("%d x %d= %d \t",j,i,i*j);
			}
			System.out.println();
		}
	}
}
