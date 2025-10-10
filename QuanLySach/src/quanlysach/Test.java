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
        QuanLySach ql = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Tim kiem sach theo ma");
            System.out.println("5. Cap nhat thong tin sach");
            System.out.println("6. Xoa sach theo ma");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống

            switch (chon) {
                case 1 : {
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
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

                    SachGiaoTrinh sg = new SachGiaoTrinh(ma, td, tg, nam, sl, mh, cd);
                    ql.them(sg);
                    System.out.println("Da them sach giao trinh thanh cong!");
                    break;
                }

                case 2 : {
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
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

                    SachTieuThuyet st = new SachTieuThuyet(ma, td, tg, nam, sl, tl, series);
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
                        System.out.println("️Khong tim thay sach co ma: " + ma);
                    }
                    break;
                }

                case 5 : {
                    ql.update(); // gọi hàm cập nhật bạn đã viết trong QuanLySach
                    break;
                }

                case 6 : {
                    System.out.print("Nhap ma sach can xoa: ");
                    String ma = sc.nextLine();
                    ql.xoa(ma);
                    System.out.println("Da xoa sach (neu ton tai).");
                    break;
                }

                case 0 : {
                    System.out.println(" Thoat chuong trinh. Tam biet!");
                    break;
                }

                default : System.out.println("️ Lua chon khong hop le!");
            }

        } while (chon != 0);
    }
}
