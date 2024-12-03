package baitap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class SinhVien{
	private String MaSV;
	private String TenSV;
	private double DiemTB;
	public SinhVien(String MaSV, String TenSV, double DiemTB){
		this.MaSV= MaSV;
		this.TenSV= TenSV;
		this.DiemTB= DiemTB;
	}
	public String getMaSV() {
		return MaSV;
	}
	public String getTenSV() {
		return TenSV;
	}
	public double getDiemTB() {
		return DiemTB;
	}
	public void setMaSV(String MaSV) {
		this.MaSV= MaSV;
	}
	public void setTenSV(String TenSV) {
		this.TenSV= TenSV;
	}
	public void setDiemTB(double DiemTB) {
		this.DiemTB= DiemTB;
	}
	public String toString() {
		return "Ma SV: "+MaSV+", Ten SV: "+TenSV+", Diem TB: "+DiemTB;
	}
}
class QuanLySV{
	private List<SinhVien> sv = new ArrayList<>();
	//them sinh vien
	public void addSinhVien(SinhVien sinhvien) {
		sv.add(sinhvien);
	}
	//xoa sinh vien theo masv
	public void removeSinhVien(String MaSV) {
		sv.removeIf(student -> student.getMaSV().equals(MaSV));
	}
	//tim kiem sinh vien theo masv
	public SinhVien findSinhVienByID(String MaSV) {
		for (SinhVien sinhvien : sv) {
            if (sinhvien.getMaSV().equals(MaSV)) {
                return sinhvien;
            }
        }
		return null;
	}
	//sap xep sinh vien theo diem
	public void sortSinhVienByDiemTB() {
		Collections.sort(sv, Comparator.comparingDouble(SinhVien::getDiemTB).reversed());
	}
	//hien thi danh sach sinh vien
	public void displaySinhVien() {
		for (SinhVien sinhvien : sv) {
            System.out.println(sinhvien);
        }
	}
}
public class bai7 {
	public static void main(String[] args) {
		QuanLySV qlsv = new QuanLySV();
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("1. Them sinh vien");
		System.out.println("2. Xoa sinh vien");
		System.out.println("3. Tim sinh vien");
		System.out.println("4. Sap xep sinh vien theo diem");
		System.out.println("5. Hien thi danh sach sinh vien");
		System.out.println("0. Ket thuc");
		do {
			System.out.println("Moi ban chon: ");
			n= sc.nextInt();
			sc.nextLine();
			switch(n) {
			case 1:
				System.out.println("Nhap ma sinh vien: ");
				String masv= sc.nextLine();
				System.out.println("Nhap ten sinh vien");
				String tensv= sc.nextLine();
				System.out.println("Nhap diem trung binh");
				double diemtb= sc.nextDouble();
				qlsv.addSinhVien(new SinhVien(masv, tensv, diemtb));
				break;
			case 2:
				System.out.println("Nhap ma sinh vien de xoa: ");
				String xoaMaSV= sc.nextLine();
				qlsv.removeSinhVien(xoaMaSV);
				break;
			case 3:
				System.out.println("Nhap ma sinh vien de tim: ");
				String timMaSV= sc.nextLine();
				SinhVien sinhvien= qlsv.findSinhVienByID(timMaSV);
				if(sinhvien!=null) {
					System.out.println(sinhvien);
				}
				else System.out.println("Khong tim thay sinh vien voi ma "+timMaSV);
				break;
			case 4:
				qlsv.sortSinhVienByDiemTB();
				System.out.println("Danh sach sinh vien sau khi sap xep theo diem: ");
				qlsv.displaySinhVien();
				break;
			case 5:
				System.out.println("Danh sach sinh vien: ");
				qlsv.displaySinhVien();
				break;
			case 0:
				System.out.println("Ket thuc");
				break;
			default:
				System.out.println("Lua chon khong hop le");
			}
		}
		while(n!=0);
		sc.close();
	}
}
