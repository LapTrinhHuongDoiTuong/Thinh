package TaiKhoanNganHang;

import java.util.Scanner;

public class TaiKhoanTietKiem extends TaiKhoan {
	private double laiSuat;
	private double tienTietKiem ;
	int soThangGui;
	public TaiKhoanTietKiem(String sDT, String soTaiKhoan, String hoTen, String MK, int soDu, double laiSuat,
			double tienTietKiem, int soThangGui) {
		super(sDT, soTaiKhoan, hoTen, MK, soDu);
		this.laiSuat = laiSuat;
		this.tienTietKiem = tienTietKiem;
		this.soThangGui = soThangGui;
	}

	public double getLaiSuat() {
		return laiSuat;
	}

	public void setLaiSuat(double laiSuat) {
		this.laiSuat = laiSuat;
	}

	public double getTienTietKiem() {
		return tienTietKiem;
	}

	public void setTienTietKiem(double tienTietKiem) {
		this.tienTietKiem = tienTietKiem;
	}

	public int getSoThangGui() {
		return soThangGui;
	}

	public void setSoThangGui(int soThangGui) {
		this.soThangGui = soThangGui;
	}

	public TaiKhoanTietKiem(String sDT, String soTaiKhoan, String hoTen, String MK, int soDu) {
		super(sDT, soTaiKhoan, hoTen, MK, soDu);
		
	}


    public TaiKhoanTietKiem() {
		
	}

	public void rutTien() {
        double soTien;
        String  soTaiKhoan;
        System.out.println("Số dư hiện tại của quý khách là: " + getSoDu());
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhập vào số tiền tiết kiệm: ");
        soTien = sc.nextDouble();
        
        if (soTien > getSoDu() || soTien <= 0) {
            System.out.println("Số tiền nhập không hợp lệ!");
        } else {
 
            setSoDu(getSoDu() - soTien);
            System.out.println("Chuyển tiền thành công!");
            System.out.println("Số dư hiện tại của quý khách là: " + getSoDu());
        }
        sc.nextLine();
    }
	
	public void rutTien(TaiKhoan tk) {
        double soTien;
        System.out.println("Số dư hiện tại của tài khoản chính là: " + tk.getSoDu());
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhập vào số tiền tiết kiệm: ");
        soTien = sc.nextDouble();
        
        if (soTien > tk.getSoDu() || soTien <= 0) {
            System.out.println("Số tiền nhập không hợp lệ!");
        } else {
        	this.setSoDu(this.getSoDu() + soTien);
            tk.setSoDu(tk.getSoDu() - soTien);
            System.out.println("Nạp tiền thành công!");
            System.out.println("Số dư hiện tại của quý khách là: " + this.getSoDu());
        }
        sc.nextLine();
    }
	public void tinhLai() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vào số tiền gửi tiết kiệm: ");
		tienTietKiem = sc.nextDouble();
		System.out.println("Nhap vao lai suất: ");
		laiSuat = sc.nextDouble();
		System.out.println("Nhap vào thời hạn gửi tiết kiệm: ");
		soThangGui = sc.nextInt();
        double tienLai = (tienTietKiem * laiSuat * soThangGui) / (12*100);
        System.out.println("Lãi suất hàng năm: " + tienLai);
        soDu = soDu + tienLai;
        tienTietKiem = tienTietKiem + tienLai;
        System.out.println("Tien tiet kiem:" + tienTietKiem);
    }

	@Override
	protected void ChuyenTien(TaiKhoan tktk) {
		
		
	}



}
