/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySach;

/**
 *
 * @author Cao Phạm Nhật Quang
 */
public class SachTieuThuyet extends Sach implements IKiemKe{
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
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
    public double tinhGiaBan() {
        double phuThu = laSachSeries ? 15000 : 0;
        return getgiaCoBan() + phuThu;
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getsoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) { 
        System.out.println("Đã chuyển sách " + gettieuDe() + " đến khu vực: " + viTriMoi);
    }
    @Override
    public void hienThiThongTin(){
       super.hienThiThongTin();
       System.out.println("The loai: " + theLoai);
       System.out.println("Loai sach gi: " + laSachSeries);
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nThe loai: " + theLoai +
                "\nLa sach series: " + laSachSeries +
                "\n=> Gia Ban: " + tinhGiaBan();
    }
    
}
