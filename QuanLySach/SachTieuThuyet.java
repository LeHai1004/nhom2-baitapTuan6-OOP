/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySach;

/**
 *
 * @author Cao Phạm Nhật Quang
 */
public class SachTieuThuyet extends Sach { 
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        double phuThu = laSachSeries ? 15000 : 0;
        return getGiaCoBan() + phuThu;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nThe loai: " + theLoai +
                "\nLa sach series: " + laSachSeries +
                "\n=> Gia Ban: " + tinhGiaBan() + " VNĐ";
    }
    
    public String gettheLoai() { return theLoai; }
    public void settheLoai(String theLoai) { this.theLoai = theLoai; }
    public boolean getlaSachSeries() { return laSachSeries; }
    public void setlaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }
    
    @Override
    public void hienThiThongTin(){
        System.out.println(this.toString());
    }
}