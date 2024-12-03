package bai1;
import java.util.Scanner;
public class HinhChuNhat {
	public double chieuDai;
	public double chieuRong;
	
	public double DienTich()
	{
		return chieuDai*chieuRong;
	}
	public double ChuVi()
	{
		return (chieuDai+chieuRong)*2;
	}
	public void Nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		chieuDai= sc.nextDouble();
		System.out.println("Nhap chieu rong: ");
		chieuRong= sc.nextDouble();
	}
	public void Xuat()
	{
		System.out.println("Chieu dai: "+chieuDai);
		System.out.println("Chieu rong: "+chieuRong);
		System.out.println("Dien tich: "+DienTich());
		System.out.println("Chieu dai: "+ChuVi());
	}
}
