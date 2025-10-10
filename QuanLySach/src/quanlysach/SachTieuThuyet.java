/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

/**
 *
 * @author HOANG HAI
 */
public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }
    
     @Override
    public String toString() {
        return super.toString() + "\n"
             + "The loai: " + theLoai + "\n"
             + "La sach series: " + (laSachSeries ? "Co" : "Khong");
    }
    
}
