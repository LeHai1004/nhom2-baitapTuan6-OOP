/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySach;

/**
 *
 * @author Cao Phạm Nhật Quang
 */
public abstract class Sach implements IGiaBan, IKiemKe {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;

    public Sach() {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    @Override
    public abstract double tinhGiaBan(); 

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách " + this.tieuDe + " đến khu vực: " + viTriMoi); // [cite: 19]
    }
    public String getmaSach() { return maSach; }
    public void setmaSach(String maSach) { this.maSach = maSach; }
    public String gettieuDe() { return tieuDe; }
    public void settieuDe(String tieuDe) { this.tieuDe = tieuDe; }
    public String gettacGia() { return tacGia; }
    public void settacGia(String tacGia) { this.tacGia = tacGia; }
    public int getnamXuatBan() { return namXuatBan; }
    public void setnamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }
    public int getsoLuong() { return soLuong; }
    public void setsoLuong(int soLuong) { this.soLuong = soLuong; }
    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }
    @Override
    public String toString() {
        return "--------------" +
                "\nMa sach: " + maSach +
                "\nTieu de: " + tieuDe +
                "\nTac gia: " + tacGia +
                "\nNam xuat ban: " + namXuatBan +
                "\nSo luong: " + soLuong +
                "\nGia co ban: " + giaCoBan;
    }

    public void hienThiThongTin() {
        System.out.println(this.toString());
    }
}