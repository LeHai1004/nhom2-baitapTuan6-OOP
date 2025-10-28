/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySach;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cao Phạm Nhật Quang
 */
public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in); // Đưa Scanner ra làm thuộc tính

    @Override
    public void them(Sach s) {
        danhSach.add(s);
        System.out.println("-> Đã thêm sách thành công!");
    }

    @Override
    public Sach timKiem(String maSach) {
        for (Sach s : danhSach) {
            if (s.getmaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void xoa(String maSach) {
        Sach s = timKiem(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("-> Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println("-> Không tìm thấy mã sách đó.");
        }
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("\n--- DANH SÁCH TẤT CẢ SÁCH ---");
        if (danhSach.isEmpty()) {
            System.out.println("(Danh sách trống)");
        } else {
            for (Sach s : danhSach) {
                System.out.println(s.toString());
            }
        }
    }

    @Override
    public void update() {
        System.out.print("Nhập mã sách cần cập nhật: ");
        String ma = sc.nextLine();

        Sach s = timKiem(ma);
        if (s == null) {
            System.out.println("-> Không tìm thấy sách có mã: " + ma);
            return;
        }

        System.out.println("\n=== Thông tin hiện tại ===");
        System.out.println(s.toString());

        int chon;
        do {
            System.out.println("\n--- BẠN MUỐN CẬP NHẬT GÌ? ---");
            System.out.println("1. Tiêu đề");
            System.out.println("2. Tác giả");
            System.out.println("3. Năm xuất bản");
            System.out.println("4. Số lượng");
            System.out.println("5. Giá cơ bản");
            
            if (s instanceof SachGiaoTrinh) {
                System.out.println("6. Môn học");
                System.out.println("7. Cấp độ");
            } else if (s instanceof SachTieuThuyet) {
                System.out.println("6. Thể loại");
                System.out.println("7. Là sách series");
            }
            System.out.println("0. Thoát cập nhật");
            System.out.print("Chọn mục: ");

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                chon = -1;
            }

            boolean daCapNhat = false;
            switch (chon) {
                case 1:
                    System.out.print("Nhập tiêu đề mới: ");
                    s.settieuDe(sc.nextLine());
                    daCapNhat = true;
                    break;
                case 2:
                    System.out.print("Nhập tác giả mới: ");
                    s.settacGia(sc.nextLine());
                    daCapNhat = true;
                    break;
                case 3:
                    System.out.print("Nhập năm xuất bản mới: ");
                    s.setnamXuatBan(Integer.parseInt(sc.nextLine()));
                    daCapNhat = true;
                    break;
                case 4:
                    System.out.print("Nhập số lượng mới: ");
                    s.setsoLuong(Integer.parseInt(sc.nextLine()));
                    daCapNhat = true;
                    break;
                case 5:
                    System.out.print("Nhập giá cơ bản mới: ");
                    s.setGiaCoBan(Double.parseDouble(sc.nextLine()));
                    daCapNhat = true;
                    break;
                case 6:
                    if (s instanceof SachGiaoTrinh) {
                        System.out.print("Nhập môn học mới: ");
                        ((SachGiaoTrinh) s).setmonHoc(sc.nextLine());
                        daCapNhat = true;
                    } else if (s instanceof SachTieuThuyet) {
                        System.out.print("Nhập thể loại mới: ");
                        ((SachTieuThuyet) s).settheLoai(sc.nextLine());
                        daCapNhat = true;
                    }
                    break;
                case 7:
                    if (s instanceof SachGiaoTrinh) {
                        System.out.print("Nhập cấp độ mới: ");
                        ((SachGiaoTrinh) s).setcapDo(sc.nextLine());
                        daCapNhat = true;
                    } else if (s instanceof SachTieuThuyet) {
                        System.out.print("Là sách series (true/false): ");
                        ((SachTieuThuyet) s).setlaSachSeries(Boolean.parseBoolean(sc.nextLine()));
                        daCapNhat = true;
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("-> Lựa chọn không hợp lệ!");
            }
            if (daCapNhat) System.out.println("-> Cập nhật thành công!");

        } while (chon != 0);
    }
}
