/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySach;

/**
 *
 * @author Cao Phạm Nhật Quang
 */
public class SachGiaoTrinh extends Sach { 
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNamDaXuatBan = 2025 - getnamXuatBan(); 
        return getGiaCoBan() + (soNamDaXuatBan * 5000);
    }

    @Override
    public String toString() { 
        return super.toString() +
                "\nMon hoc: " + monHoc +
                "\nCap do: " + capDo +
                "\n=> Gia Ban: " + tinhGiaBan() + " VNĐ";
    }

    public String getmonHoc() { return monHoc; }
    public void setmonHoc(String monHoc) { this.monHoc = monHoc; }
    public String getcapDo() { return capDo; }
    public void setcapDo(String capDo) { this.capDo = capDo; }
    
    @Override
    public void hienThiThongTin(){
        System.out.println(this.toString());
    }
}