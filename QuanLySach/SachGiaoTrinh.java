/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySach;

/**
 *
 * @author Cao Phạm Nhật Quang
 */
public class SachGiaoTrinh extends Sach{
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(String  maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    public String getmonHoc(){
        return monHoc;
    }
    public void setmonHoc(String monHoc){
        this.monHoc = monHoc;
    }
    public String getcapDo(){
        return capDo;
    }
    public void setcapDo(String capDo){
        this.capDo = capDo;
    }
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Mon hoc: " + monHoc);
        System.out.println("Cap do: " + capDo);
    }
}
