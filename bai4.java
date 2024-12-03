package baitap;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
      long Sotiengui;
      double Laisuat;
      int Sothanggui;
      Scanner sc= new Scanner(System.in);
      System.out.println("Nhap vao lan luot so tien gui, lai suat hang nam va so thang gui: ");
      Sotiengui= sc.nextLong();
      Laisuat= sc.nextDouble();
      Sothanggui= sc.nextInt();

      double Sotienlai= (Sotiengui*Laisuat*Sothanggui)/12/100;
      System.out.println("So tien lai: "+Sotienlai);
      double Sotiengocck= Sotiengui+Sotienlai;
      System.out.println("So tien goc cuoi ky: "+Sotiengocck);
  }
}