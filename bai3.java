package baitap;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
      int a, b;
      Scanner sc= new Scanner(System.in);
      System.out.println("Nhap a: ");
      a= sc.nextInt();
      System.out.println("Nhap b: ");
      b= sc.nextInt();

      int Tong= a+b;
      System.out.println("Tong= "+Tong);
      int Hieu= a-b;
      System.out.println("Hieu= "+Hieu);
      int Tich= a*b;
      System.out.println("Tich= "+Tich);
      double Thuong= a*1.0/b;
      System.out.println("Thuong= "+Thuong);
      int Du= a%b;
      System.out.println("Du= "+Du);
  }
}