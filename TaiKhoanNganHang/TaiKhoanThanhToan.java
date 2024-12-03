package TaiKhoanNganHang;

import java.util.Scanner;

public class TaiKhoanThanhToan extends TaiKhoan {
    private double hanMuc;

    public TaiKhoanThanhToan(String sdt, String soTaiKhoan, String hoTen, String mk, double soDu, double hanMuc) {
        super(sdt, soTaiKhoan, hoTen, mk, soDu);
        this.hanMuc = hanMuc;
    }
    
    
    public TaiKhoanThanhToan() {
		
	}


	public double getPhiGiaoDich() {
        return hanMuc;
    }

    public void setPhiGiaoDich(double hanMuc) {
        this.hanMuc = hanMuc;
    }
    
    @Override
	public double getSoDu() {
		
		return super.getSoDu();
	}

	@Override
	public void DangKy() {
		
		super.DangKy();
		Scanner sc = new Scanner(System.in);
		hanMuc = 10000000;
		
	}	
	@Override
	public void DangNhap() {
		
		super.DangNhap();
	}
    public void ChuyenTien(TaiKhoan tk) {
        double soTien;
        System.out.println("Số dư hiện tại của quý khách là: " + this.getSoDu());
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhập vào số tiền muốn chuyển: ");
        soTien = sc.nextDouble();
        
        if (soTien > this.getSoDu() || soTien <= 0 || soTien > hanMuc) {
            System.out.println("Số tiền nhập không hợp lệ!");
        } else {
 
            this.setSoDu(this.getSoDu() - soTien);
            tk.setSoDu(tk.getSoDu() + soTien);
            System.out.println("Chuyển tiền thành công!");
            System.out.println("Số dư hiện tại của quý khách là: " + getSoDu());
        }
        sc.nextLine();
    }

    public void rutTien() {
        double soTien;
        System.out.println("Số dư hiện tại của quý khách là: " + this.getSoDu());
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhập vào số tiền muốn rút: ");
        soTien = sc.nextDouble();
        
        if (soTien > this.getSoDu() || soTien <= 0 || soTien > hanMuc) {
            System.out.println("Số tiền nhập không hợp lệ!");
        } else {
 
            this.setSoDu(this.getSoDu() - soTien);
            System.out.println("Rút tiền thành công!");
            System.out.println("Số dư hiện tại của quý khách là: " + getSoDu());
        }
        sc.nextLine();
    }


	@Override
	protected double getTienTietKiem() {
		
		return 0;
	}


	@Override
	protected void tinhLai() {
		
		
	}


	@Override
	protected void rutTien(TaiKhoan tktt2) {
		
		
	}

	
    
}

	