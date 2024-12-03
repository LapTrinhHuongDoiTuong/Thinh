package TaiKhoanNganHang;
import java.util.Scanner;
public abstract class TaiKhoan {
	protected String SDT;
	protected String soTaiKhoan;
	protected String hoTen;
	protected  String MK;
	protected double soDu;
	double soTienGui;
	double soTienRut;
	Scanner sc = new Scanner(System.in);
	
	public TaiKhoan(String sDT, String soTaiKhoan, String hoTen, String MK, double soDu) {
		SDT = sDT;
		this.soTaiKhoan = soTaiKhoan;
		this.hoTen = hoTen;
		this.MK = MK;
		this.soDu = soDu;
	}
	
	public TaiKhoan() {
		super();
	}

	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}
	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMatKhauTaiKhoan() {
		return MK;
	}
	public void setMatKhauTaiKhoan(String matKhauTaiKhoan) {
		this.MK = MK;
	}
	public double getSoDu() {
		return soDu;
	}
	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}
			
	public void DangKy() {
				
				System.out.print("Nhập số điện thoai:");
				 SDT=sc. nextLine();
				System.out.print("Nhập họ tên:");
				 hoTen= sc.nextLine();
				System.out.print("Nhập số tài khoản: ");
		         soTaiKhoan = sc.nextLine();
		        
		        System.out.print("Mật khẩu: ");
		         MK = sc.nextLine();	
		        
				System.out.println("Tạo tài khoản thành công!");	
		        
			}
			public void DangNhap() {
			int soLanThu = 0;
			while(soLanThu<3) {
		        System.out.print("Số tài khoản: ");
		        String STKDangNhap = sc.nextLine();
		        
		        System.out.print("Mật khẩu: ");
		        String MKDangNhap = sc.nextLine();
		        if (STKDangNhap.equals(soTaiKhoan) && MKDangNhap.equals(MK)) {
		            System.out.println("Đăng nhập thành công!");
		            return ;
		        } else {
		            System.out.println("Tên tài khoản hoặc mật khẩu không chính xác.");
		            soLanThu++;
		            
		        }
		        if(soLanThu==3) {
		        	 System.out.println("Đã nhập sai mật khẩu 3 lần.");
		             quenMK(); // Gọi phương thức quên mật khẩu
		         }
		        }	        
			}
			public void guiTien() {
				Scanner sc= new Scanner(System.in);
				System.out.println("Nhap so tien gui:  ");
				soTienGui= sc.nextInt();
				if (soTienGui > 0) {
		             soDu = soDu + soTienGui;
					System.out.println("Đã gửi thành công " + soTienGui+ ". Số dư hiện tại là: " + soDu);
		        } else {
		            System.out.println("Số tiền gửi phải lớn hơn 0.");
		        }
			}
			public abstract void rutTien();
			
			public void doiMatKhau() {
					int soLanNhap = 0;
			        while(soLanNhap<3) {
			        System.out.print("Nhập lại mật khẩu cũ: ");
			        String MKCu = sc.nextLine();
			        
			        if (!MKCu.equals(MK)) {
			            System.out.println("Mật khẩu sai!");
			            soLanNhap++;
			            return;
			        }

			        System.out.print("Nhập mật khẩu mới: ");
			        String MKMoi = sc.nextLine();
			        
			        System.out.print("Nhập lại mật khẩu mới: ");
			        String MKXacNhan = sc.nextLine();
			        
			        if (MKMoi.equals(MKXacNhan)) {
			            System.out.println("Đã đổi mật khẩu thành công!");
			            MK = MKMoi;
			        }
			        
			        System.out.println("Mật khẩu mới không đúng");
			    }
			        if (soLanNhap == 3) {
			            System.out.println("Bạn đã nhập sai mật khẩu cũ 3 lần.");
			            System.out.println("Chọn quên mật khẩu!");
			            quenMK(); // Gọi phương thức quên mật khẩu
			        }}
			public void quenMK() {
				String matKhau, MKmoi, kTra, kTraMoi;
				System.out.println("Nhap so dien thoai cua ban: ");
				String SDTxacnhan=sc.nextLine();
				if(!SDTxacnhan.equals(SDT)) {
					System.out.println("Số điện thoại sai!");
					return;
				}
				SDTxacnhan=SDT ;
					System.out.println("Nhap mat khau moi: ");
					MKmoi = sc.nextLine();
					System.out.println("Nhap lai may khau moi: ");
					kTraMoi = sc.nextLine();
					if (kTraMoi.equals(MKmoi))
					{
						this.MK = MKmoi;
						System.out.println("Đổi mật khẩu thành công!");
					}
						
					else
					{
						System.out.println("Khong trung khop mau khau moi!");
					}	
				}
					
			public void thongTin(TaiKhoan tktk, TaiKhoan tkgd) {
				System.out.println("So tai khoan: "+this.soTaiKhoan);
				System.out.println("Ho ten: "+this.hoTen);
				
				System.out.println("SDT: "+this.SDT);
				System.out.println("So du tai khoan: "+this.soDu);
				
				System.out.println("Số dư tiền tiết kiệm:"+ tktk.getTienTietKiem());
				System.out.println("Số tiền giao dịch gần đây: " +tkgd.getSoDu());
				
			}

			protected abstract double getTienTietKiem();

			protected abstract void ChuyenTien(TaiKhoan tktk);

			protected abstract void tinhLai();

			protected abstract void rutTien(TaiKhoan tkgd);
			

			}
