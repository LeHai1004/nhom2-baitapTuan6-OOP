/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlysach;

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
        
        // Thêm vài sách
        SachGiaoTrinh sgk = new SachGiaoTrinh("Lap trinh Java", "Dai hoc", "GT001", "Lap trinh huong doi tuong", "Nguyen Van A", 2023, 10);
        SachTieuThuyet stt = new SachTieuThuyet("Lang man", true, "TT001", "Tinh yeu thoi cong nghe", "Tran Thi B", 2020, 5);
        
        ql.them(sgk);
        ql.them(stt);
        
        // Hiển thị danh sách
        System.out.println("=== Danh sach sach ===");
        ql.hienthidanhsach();
        
        // Tìm kiếm
        System.out.println("\n=== Tim sach co ma GT001 ===");
        Sach s = ql.timkiem("GT001");
        if (s != null) {
            System.out.println(s.toString());
        }
        
        // Cập nhật
//        ql.update("TT001", 8);
        
        // Xóa
        ql.xoa("GT001");
        
        System.out.println("\n=== Danh sach sau khi xoa ===");
        ql.hienthidanhsach();
    }
    
}
