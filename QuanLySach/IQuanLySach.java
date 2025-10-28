package QuanLySach;

public interface IQuanLySach {
    void themSach(Sach sach);
    boolean xoaSach(String maSach);
    boolean capNhatSach(String maSach, String tieuDeMoi, String tacGiaMoi, int namXuatBanMoi, int soLuongMoi);
    Sach timSach(String maSach);
    void hienThiDanhSach();
}