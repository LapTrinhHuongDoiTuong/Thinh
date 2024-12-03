package TaiKhoanNganHang;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaiKhoan tktk = new TaiKhoanTietKiem();
        TaiKhoan tktt = new TaiKhoanThanhToan();
        TaiKhoan tktt2 = new TaiKhoanThanhToan("0941234567", "9876543211","HO SI THINH", "Thinh1507@", 3000000, 900000000);
        int chucNang = 0;
        
        
        do {
        	System.out.println("1.Đăng kí ");
        	System.out.println("2.Đăng nhập ");
        	System.out.println("0.Thoát");
        	System.out.print("Chọn chức năng: ");
        	chucNang = sc.nextInt();
            
            switch (chucNang) {
                case 1:
                    tktt.DangKy();
                    break;
                case 2:
                    tktt.DangNhap();
                    
                    int luaChon;
				int phuongThuc = 0;
				do {
                       System.out.println("1.Xem thông tin");
                       System.out.println("2.Gửi tiền");
                       System.out.println("3.Rút tiền");
                       System.out.println("4.Đổi mật khẩu");
                       System.out.println("5.Tính tiền lãi");
                       System.out.println("6.Thanh toán");
                       System.out.println("0.Thoát");
                    	luaChon = sc.nextInt();

                        switch (luaChon) {
                            case 1:
                                tktt.thongTin(tktk, tktt);
                                break;
                            case 2:
                                tktt.guiTien();
                                System.out.println("Số dư tài khoản là: " + tktt.getSoDu());
                                break;
                            case 3:
                            	tktt.rutTien();
                            	System.out.println("Số dư tài khoản là: " + tktt.getSoDu());
                                break;
                                
                            case 4:
                            	tktt.doiMatKhau();
                                break;
             
                            case 5:
                            	tktk.rutTien(tktt);
                                tktk.tinhLai();
                                break;
                            case 6:
                                String soTaiKhoan;
                            	System.out.print("Nhập số tài khoản của tài khoản muốn chuyển: ");
                                soTaiKhoan = sc.nextLine();
                                tktt.ChuyenTien(tktt2);
                                break;
                            case 0:
                                System.out.println("Thoát");
                                break;
                            default:
                                System.out.println("Không hợp lệ!");
                        }
                    } while (phuongThuc != 0);
                    break;
                case 0:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Không hợp lệ!");
            }
        } while (chucNang != 0);

        sc.close();
    }
}
