/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

/**
 *
 * @author HOANG HAI
 */
// 1. Khai báo là abstract class và implements 2 interface
public abstract class Sach implements IGiaBan, IKiemKe {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan; // Yêu cầu 1: Bổ sung giaCoBan
    private String viTri; // Thêm thuộc tính vị trí để hàm capNhatViTri có ý nghĩa

    public Sach() {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
        this.viTri = viTri; // Gán một vị trí mặc định
    }

    // --- Các getters và setters ---
    public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong khong hop le!");
        }
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    // --- Phương thức hiển thị ---
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("Gia co ban: " + giaCoBan);
        System.out.println("Vi tri: " + viTri);
        System.out.println("---------------------------");
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tieuDe=" + tieuDe + ", tacGia=" + tacGia + ", namXuatBan=" + namXuatBan + ", soLuong=" + soLuong + ", viTri=" + viTri + '}';
    }

    // --- Triển khai các phương thức từ Interface ---

    // 2. Từ IGiaBan: Để abstract để các lớp con tự định nghĩa
    @Override
    public abstract double tinhGiaBan();

    // 3. Từ IKiemKe: Triển khai ngay tại lớp cha (Yêu cầu 2.3)
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        // Sửa lại logic cho đúng: >= (lớn hơn hoặc BẰNG)
        return this.soLuong >= soLuongToiThieu;
    }

    // 4. Từ IKiemKe: Triển khai ngay tại lớp cha (Yêu cầu 2.3)
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách [" + this.tieuDe + "] từ vị trí " + this.viTri + " đến khu vực: " + viTriMoi);
        this.viTri = viTriMoi; // Cập nhật vị trí mới
    }
}