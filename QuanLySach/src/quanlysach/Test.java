/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlysach;
import java.util.Scanner;
/**
 *
 * @author HOANG HAI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLySachImpl ql = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        // Thêm dữ liệu mẫu
        ql.them(new SachGiaoTrinh("SGT01", "Toan Cao Cap", "Nguyen A", 2020, 50, "Toan", "Dai hoc", 120000.0));
        ql.them(new SachTieuThuyet("STT01", "Harry Potter", "J.K. Rowling", 2005, 100, "Phieu luu", true, 150000.0));
        
        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Tim kiem sach theo ma");
            System.out.println("5. Cap nhat thong tin sach");
            System.out.println("6. Xoa sach theo ma");
            // ===== THÊM MỚI 2 LỰA CHỌN MENU =====
            System.out.println("7. Kiem tra ton kho");
            System.out.println("8. Cap nhat vi tri sach");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống

            switch (chon) {
                case 1 : {
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    // (Bạn có thể thêm kiểm tra trùng mã ở đây)
                    // if (ql.timkiem(ma) != null) { System.out.println("Ma da ton tai!"); break; }
                    System.out.print("Nhap tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam = sc.nextInt();
                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap mon hoc: ");
                    String mh = sc.nextLine();
                    System.out.print("Nhap cap do: ");
                    String cd = sc.nextLine();
                    System.out.print("Nhap gia co ban: ");
                    double gia = sc.nextDouble();
                    sc.nextLine(); 
                    
                    // THÊM MỚI: Nhập vị trí
                    System.out.print("Nhap vi tri dat sach: ");
                    String viTri = sc.nextLine();

                    SachGiaoTrinh sg = new SachGiaoTrinh(ma, td, tg, nam, sl, mh, cd, gia);
                    sg.setViTri(viTri); // THÊM MỚI: Gán vị trí
                    
                    ql.them(sg);
                    System.out.println("Da them sach giao trinh thanh cong!");
                    break;
                }

                case 2 : {
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    // (Bạn có thể thêm kiểm tra trùng mã ở đây)
                    System.out.print("Nhap tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam = sc.nextInt();
                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap the loai: ");
                    String tl = sc.nextLine();
                    System.out.print("La sach series (true/false): ");
                    boolean series = sc.nextBoolean();
                    System.out.print("Nhap gia co ban: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();
                    
                    // THÊM MỚI: Nhập vị trí
                    System.out.print("Nhap vi tri dat sach: ");
                    String viTri = sc.nextLine();
                    
                    SachTieuThuyet st = new SachTieuThuyet(ma, td, tg, nam, sl, tl, series, gia);
                    st.setViTri(viTri); // THÊM MỚI: Gán vị trí
                    
                    ql.them(st);
                    System.out.println("Da them sach tieu thuyet thanh cong!");
                    break;
                }

                case 3 : {
                    System.out.println("\n=== DANH SACH SACH ===");
                    ql.hienthidanhsach();
                    break;
                }

                case 4 : {
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    Sach s = ql.timkiem(ma);
                    if (s != null) {
                        System.out.println("Tim thay sach:");
                        System.out.println(s.toString());
                    } else {
                        System.out.println("Khong tim thay sach co ma: " + ma);
                    }
                    break;
                }

                case 5 : {
                    ql.update(); // Gọi hàm cập nhật (đã có lựa chọn cập nhật vị trí bên trong)
                    break;
                }

                case 6 : {
                    System.out.print("Nhap ma sach can xoa: ");
                    String ma = sc.nextLine();
                    ql.xoa(ma); // Hàm xoa() đã có thông báo riêng
                    break;
                }
                // ===== THÊM MỚI 2 CASE XỬ LÝ =====
                case 7: {
                    System.out.print("Nhap ma sach can kiem tra: ");
                    String maKiemTra = sc.nextLine();
                    Sach sKiemTra = ql.timkiem(maKiemTra);
                    
                    if (sKiemTra != null) {
                        System.out.print("Nhap so luong ton kho toi thieu can kiem tra: ");
                        int slToiThieu = sc.nextInt();
                        sc.nextLine(); // dọn dẹp
                        
                        // Gọi phương thức từ đối tượng Sach
                        boolean ketQua = sKiemTra.kiemTraTonKho(slToiThieu);
                        
                        if (ketQua) {
                            System.out.println("=> KET QUA: OK! So luong ton kho (" + sKiemTra.getSoLuong() + ") >= " + slToiThieu);
                        } else {
                            System.out.println("=> KET QUA: Can nhap them! So luong ton kho (" + sKiemTra.getSoLuong() + ") < " + slToiThieu);
                        }
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }
                
                case 8: {
                    System.out.print("Nhap ma sach can cap nhat vi tri: ");
                    String maViTri = sc.nextLine();
                    Sach sViTri = ql.timkiem(maViTri);
                    
                    if (sViTri != null) {
                        System.out.println("Vi tri hien tai: " + sViTri.getViTri());
                        System.out.print("Nhap vi tri moi: ");
                        String viTriMoi = sc.nextLine();
                        
                        // Gọi phương thức từ đối tượng Sach
                        sViTri.capNhatViTri(viTriMoi);
                        System.out.println("Da cap nhat vi tri thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }
                case 0 : {
                    System.out.println(" Thoat chuong trinh. Tam biet!");
                    break;
                }

                default : System.out.println(" Lua chon khong hop le!");
            }

        } while (chon != 0);
    }
}