/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySach;

/**
 *
 * @author Cao Phạm Nhật Quang
 */
public class SachTieuThuyet extends Sach{
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public String gettheLoai(){
        return theLoai;
    }
    public void settheLoai(String theLoai){
        this.theLoai = theLoai;
    }
    public boolean getlaSachSeries(){
        return laSachSeries;
    }
    public void setlaSachSeries(boolean laSachSeries){
        this.laSachSeries = laSachSeries;
    }
    @Override
    public void hienThiThongTin(){
       super.hienThiThongTin();
       System.out.println("The loai: " + theLoai);
       System.out.println("Loai sach gi: " + laSachSeries);
    }
    
}
