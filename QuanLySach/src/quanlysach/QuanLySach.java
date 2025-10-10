/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author HOANG HAI
 */
public class QuanLySach {
    ArrayList <Sach> danhsach = new ArrayList<>();

    public void them(Sach s){
        danhsach.add(s);
    }
    public Sach timkiem(String masach){
        for(Sach s : danhsach){
            if(s.getMaSach().equalsIgnoreCase(masach)){
                return s;
            }
        }
        return null;
    }
    public void xoa(String masach){
        Sach s = timkiem(masach);
        if(s != null){
            danhsach.remove(s);
        }
        else{
            System.out.println("khong tim thay ma sach do. ");
        }
    }
    public void update() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma sach can cap nhat: ");
    String ma = sc.nextLine();

    Sach s = timkiem(ma);
    if (s == null) {
        System.out.println("Khong tim thay sach co ma: " + ma);
        return;
    }

    System.out.println("\n=== Thong tin hien tai ===");
    System.out.println(s.toString());

    System.out.println("\nBan muon cap nhat gi?");
    System.out.println("1. Tieu de");
    System.out.println("2. Tac gia");
    System.out.println("3. Nam xuat ban");
    System.out.println("4. So luong");
    if (s instanceof SachGiaoTrinh) {
        System.out.println("5. Mon hoc");
        System.out.println("6. Cap do");
    } else if (s instanceof SachTieuThuyet) {
        System.out.println("5. The loai");
        System.out.println("6. La sach series");
    }
    System.out.print("Chon muc can cap nhat: ");
    int chon = sc.nextInt();
    sc.nextLine(); // bỏ dòng trống

    switch (chon) {
        case 1:
            System.out.print("Nhap tieu de moi: ");
            s.setTieuDe(sc.nextLine());
            break;
        case 2:
            System.out.print("Nhap tac gia moi: ");
            s.setTacGia(sc.nextLine());
            break;
        case 3:
            System.out.print("Nhap nam xuat ban moi: ");
            s.setNamXuatBan(sc.nextInt());
            break;
        case 4:
            System.out.print("Nhap so luong moi: ");
            s.setSoLuong(sc.nextInt());
            break;
        case 5:
            if (s instanceof SachGiaoTrinh) {
                SachGiaoTrinh sg = (SachGiaoTrinh) s;
                System.out.print("Nhap mon hoc moi: ");
                sg.setMonHoc(sc.nextLine());
            } else if (s instanceof SachTieuThuyet) {
                SachTieuThuyet st = (SachTieuThuyet) s;
                System.out.print("Nhap the loai moi: ");
                st.setTheLoai(sc.nextLine());
            }
            break;
        case 6:
            if (s instanceof SachGiaoTrinh) {
                SachGiaoTrinh sg = (SachGiaoTrinh) s;
                System.out.print("Nhap cap do moi: ");
                sg.setCapDo(sc.nextLine());
            } else if (s instanceof SachTieuThuyet) {
                SachTieuThuyet st = (SachTieuThuyet) s;
                System.out.print("La sach series (true/false): ");
                st.setLaSachSeries(sc.nextBoolean());
            }
            break;
        default:
            System.out.println("Lua chon khong hop le!");
    }

    System.out.println("\n Cap nhat thanh cong!");
}
    
    public void hienthidanhsach(){
        if(danhsach.isEmpty()){
            System.out.println("danh sach trong.");
        }
        else{
            for(Sach s : danhsach){
                  System.out.println(s.toString());
            }
        }
    }
}
