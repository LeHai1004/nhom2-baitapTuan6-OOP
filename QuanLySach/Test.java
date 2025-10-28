package QuanLySach;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    
    private static IQuanLySach quanLy = new QuanLySachImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        quanLy.themSach(new SachGiaoTrinh("SGK1", "Giáo Trình Java", "Nguyễn Văn A", 2021, 20, 50000, "Lập trình", "Đại học"));
        quanLy.themSach(new SachTieuThuyet("STT1", "Đắc Nhân Tâm", "Dale Carnegie", 2018, 15, 60000, "Kỹ năng sống", true));

        boolean running = true;
        while (running) {
            showMenu();
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        themMoiSachGiaoTrinh();
                        break;
                    case 2:
                        themMoiSachTieuThuyet();
                        break;
                    case 3:
                        quanLy.hienThiDanhSach();
                        break;
                    case 4:
                        timKiemSach();
                        break;
                    case 5:
                        xoaSach();
                        break;
                    case 6:
                        capNhat();
                        break;
                    case 7:
                        kiemKe();
                        break;
                    case 0:
                        running = false;
                        System.out.println("👋 Tạm biệt!");
                        break;
                    default:
                        System.out.println("❌ Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Lỗi: Vui lòng nhập một số.");
                scanner.nextLine(); 
            }
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n--- 📖 MENU QUẢN LÝ SÁCH 📖 ---");
        System.out.println("1. Thêm Sách Giáo Trình mới");
        System.out.println("2. Thêm Sách Tiểu Thuyết mới");
        System.out.println("3. Hiển thị tất cả sách");
        System.out.println("4. Tìm sách theo Mã sách");
        System.out.println("5. Xóa sách theo Mã sách");
        System.out.println("6. Cập nhật thông tin sách");
        System.out.println("7. Kiểm tra tồn kho & Cập nhật vị trí");
        System.out.println("0. Thoát chương trình");
        System.out.print("👉 Vui lòng chọn chức năng: ");
    }

    private static void themMoiSachGiaoTrinh() {
        try {
            System.out.print("Nhập mã sách: ");
            String maSach = scanner.nextLine();
            System.out.print("Nhập tiêu đề: ");
            String tieuDe = scanner.nextLine();
            System.out.print("Nhập tác giả: ");
            String tacGia = scanner.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            int nam = scanner.nextInt();
            System.out.print("Nhập số lượng: ");
            int sl = scanner.nextInt();
            System.out.print("Nhập giá cơ bản: ");
            double gia = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Nhập môn học: ");
            String monHoc = scanner.nextLine();
            System.out.print("Nhập cấp độ: ");
            String capDo = scanner.nextLine();

            Sach sgt = new SachGiaoTrinh(maSach, tieuDe, tacGia, nam, sl, gia, monHoc, capDo);
            quanLy.themSach(sgt);
        } catch (InputMismatchException e) {
            System.out.println("❌ Lỗi: Nhập liệu không đúng định dạng số.");
            scanner.nextLine(); 
        }
    }

    private static void themMoiSachTieuThuyet() {
         try {
            System.out.print("Nhập mã sách: ");
            String maSach = scanner.nextLine();
            System.out.print("Nhập tiêu đề: ");
            String tieuDe = scanner.nextLine();
            System.out.print("Nhập tác giả: ");
            String tacGia = scanner.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            int nam = scanner.nextInt();
            System.out.print("Nhập số lượng: ");
            int sl = scanner.nextInt();
            System.out.print("Nhập giá cơ bản: ");
            double gia = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Nhập thể loại: ");
            String theLoai = scanner.nextLine();
            System.out.print("Có phải sách series không? (true/false): ");
            boolean isSeries = scanner.nextBoolean();
            scanner.nextLine(); 

            Sach stt = new SachTieuThuyet(maSach, tieuDe, tacGia, nam, sl, gia, theLoai, isSeries);
            quanLy.themSach(stt);
        } catch (InputMismatchException e) {
            System.out.println("❌ Lỗi: Nhập liệu không đúng định dạng.");
            scanner.nextLine(); 
        }
    }

    private static void timKiemSach() {
        System.out.print("Nhập mã sách cần tìm: ");
        String maSach = scanner.nextLine();
        Sach sach = quanLy.timSach(maSach);
        if (sach != null) {
            System.out.println("🔎 Tìm thấy sách:");
            sach.hienThiThongTin();
        } else {
            System.out.println("❌ Không tìm thấy sách có mã: " + maSach);
        }
    }

    private static void xoaSach() {
        System.out.print("Nhập mã sách cần xóa: ");
        String maSach = scanner.nextLine();
        quanLy.xoaSach(maSach); 
    }
    
    private static void capNhat() {
        try {
            System.out.print("Nhập mã sách cần cập nhật: ");
            String maSach = scanner.nextLine();
            
            Sach sach = quanLy.timSach(maSach);
            if (sach == null) {
                System.out.println("❌ Không tìm thấy sách để cập nhật.");
                return;
            }
            
            System.out.println("Đang cập nhật cho sách: " + sach.getTieuDe());
            System.out.print("Nhập tiêu đề mới: ");
            String tieuDeMoi = scanner.nextLine();
            System.out.print("Nhập tác giả mới: ");
            String tacGiaMoi = scanner.nextLine();
            System.out.print("Nhập năm xuất bản mới: ");
            int namMoi = scanner.nextInt();
            System.out.print("Nhập số lượng mới: ");
            int slMoi = scanner.nextInt();
            scanner.nextLine(); 

            quanLy.capNhatSach(maSach, tieuDeMoi, tacGiaMoi, namMoi, slMoi);

        } catch (InputMismatchException e) {
            System.out.println("❌ Lỗi: Nhập liệu không đúng định dạng số.");
            scanner.nextLine(); 
        }
    }
    
    private static void kiemKe() {
        System.out.print("Nhập mã sách cần kiểm kê: ");
        String maSach = scanner.nextLine();
        Sach sach = quanLy.timSach(maSach);
        
        if (sach == null) {
            System.out.println("❌ Không tìm thấy sách có mã: " + maSach);
            return;
        }

        try {
            System.out.print("Nhập số lượng tồn kho tối thiểu cần kiểm tra: ");
            int minStock = scanner.nextInt();
            scanner.nextLine(); 
            
            boolean duHang = sach.kiemTraTonKho(minStock);
            System.out.println("-> Kết quả kiểm tra (>= " + minStock + "): " + (duHang ? "ĐỦ HÀNG" : "KHÔNG ĐỦ HÀNG"));
            
            System.out.print("Nhập vị trí kho mới (Ví dụ: A1-Kệ 3): ");
            String viTriMoi = scanner.nextLine();
            sach.capNhatViTri(viTriMoi);

        } catch (InputMismatchException e) {
            System.out.println("❌ Lỗi: Vui lòng nhập một số nguyên.");
            scanner.nextLine(); 
        }
    }
}