package QuanLySach;

public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNam * 5000);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Môn học: " + monHoc +
                ", Cấp độ: " + capDo +
                ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("✅ Đã chuyển sách '" + getTieuDe() + "' đến khu vực: " + viTriMoi);
    }
}
