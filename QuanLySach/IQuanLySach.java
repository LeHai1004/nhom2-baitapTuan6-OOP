/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package QuanLySach;

/**
 *
 * @author Cao Phạm Nhật Quang
 */
public interface IQuanLySach {
    void them(Sach s);
    Sach timKiem(String maSach);
    void xoa(String maSach);
    void update();
    void hienThiDanhSach();
}
