/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySach;

/**
 *
 * @author Cao Phạm Nhật Quang
 */
import java.util.Scanner;
public class Test {
   
    private static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        
        IQuanLySach qlSach = new QuanLySachImpl();
        
        int chon;

        SachGiaoTrinh s1 = new SachGiaoTrinh("GT01", "Toán cao cấp A1", "Nguyễn Văn A", 2020, 50, 80000.0, "Toán học", "Đại học");
        SachTieuThuyet s2 = new SachTieuThuyet("TT01", "Dế Mèn phiêu lưu ký", "Tô Hoài", 1941, 100, 50000.0, "Thiếu nhi", true);
        
        qlSach.them(s1);
        qlSach.them(s2);

        do { 
            System.out.println("\n========= MENU QUẢN LÝ SÁCH =========");
            System.out.println("1. Thêm một cuốn sách mới");
            System.out.println("2. Hiển thị danh sách tất cả sách");
            System.out.println("3. Cập nhật thông tin một cuốn sách");
            System.out.println("4. Xóa một cuốn sách");
            System.out.println("5. Tìm kiếm sách theo mã");
            System.out.println("6. Kiểm tra tồn kho (IKiemKe)");
            System.out.println("0. Thoát chương trình");
            System.out.println("======================================");
            System.out.print(">> Mời bạn chọn chức năng: ");

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                chon = -1;
            }

            switch (chon) {
                case 1:
                    themMoiSach(qlSach);
                    break;
                case 2:
                    qlSach.hienThiDanhSach();
                    break;
                case 3:
                    qlSach.update();
                    break;
                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    qlSach.xoa(maXoa);
                    break;
                case 5:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    Sach sachTimThay = qlSach.timKiem(maTim);
                    if (sachTimThay != null) {
                        System.out.println("-> Tìm thấy sách:");
                        System.out.println(sachTimThay.toString());
                    } else {
                        System.out.println("-> Không tìm thấy sách có mã " + maTim);
                    }
                    break;
                case 6:
                    kiemTraKho(qlSach);
                    break;
                case 0:
                    System.out.println("Cảm ơn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("-> Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        } while (chon != 0);

        sc.close();
    }

    public static void themMoiSach(IQuanLySach ql) { 
        System.out.println("--- Thêm sách mới ---");
        System.out.print("Chọn loại sách (1: Sách giáo trình, 2: Sách tiểu thuyết): ");
        int loaiSach = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();
        System.out.print("Nhập tiêu đề: ");
        String tieuDe = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int namXB = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giá cơ bản: ");
        double giaCoBan = Double.parseDouble(sc.nextLine());

        if (loaiSach == 1) {
            System.out.print("Nhập môn học: ");
            String monHoc = sc.nextLine();
            System.out.print("Nhập cấp độ (Phổ thông, Đại học,...): ");
            String capDo = sc.nextLine();
            
            SachGiaoTrinh sgt = new SachGiaoTrinh(maSach, tieuDe, tacGia, namXB, soLuong, giaCoBan, monHoc, capDo);
            ql.them(sgt);
            
        } else if (loaiSach == 2) {
            System.out.print("Nhập thể loại (Lãng mạn, Viễn tưởng,...): ");
            String theLoai = sc.nextLine();
            System.out.print("Có phải sách series không (true/false): ");
            boolean isSeries = Boolean.parseBoolean(sc.nextLine());
            
            SachTieuThuyet stt = new SachTieuThuyet(maSach, tieuDe, tacGia, namXB, soLuong, giaCoBan, theLoai, isSeries);
            ql.them(stt); 
            
        } else {
            System.out.println("-> Lựa chọn loại sách không hợp lệ!");
        }
    }
    
    public static void kiemTraKho(IQuanLySach ql) {
        System.out.print("Nhập mã sách cần kiểm tra kho: ");
        String maTim = sc.nextLine();
        Sach sachTimThay = ql.timKiem(maTim);
        
        if (sachTimThay != null) {

            System.out.print("Nhập số lượng tối thiểu cần kiểm tra: ");
            int sl = Integer.parseInt(sc.nextLine());
            boolean duHang = sachTimThay.kiemTraTonKho(sl);
            System.out.println("-> Sách '" + sachTimThay.gettieuDe() + "' có đủ " + sl + " cuốn không? -> " + duHang);
            
            System.out.print("Nhập vị trí mới: ");
            String viTri = sc.nextLine();
            sachTimThay.capNhatViTri(viTri);
            
        } else {
            System.out.println("-> Không tìm thấy sách có mã " + maTim);
        }
    }
}