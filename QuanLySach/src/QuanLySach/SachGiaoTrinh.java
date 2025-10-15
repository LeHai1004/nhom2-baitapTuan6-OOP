package QuanLySach;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         double giaCoBan, String monHoc, String capDo) {
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
        int namHienTai = 2025;
        int soNam = namHienTai - getNamXuatBan();
        if (soNam < 0) soNam = 0;
        return getGiaCoBan() + soNam * 5000.0;
    }

    @Override
    public String toString() {
        return "Sach giao trinh:" +
               "\nMa sach: " + getMaSach() +
               "\nTieu de: " + getTieuDe() +
               "\nTac gia: " + getTacGia() +
               "\nNam xuat ban: " + getNamXuatBan() +
               "\nSo luong: " + getSoLuong() +
               String.format("\nGia co ban: %.0f VND\nGia ban tinh duoc: %.0f VND", getGiaCoBan(), tinhGiaBan()) +
               "\nMon hoc: " + monHoc +
               "\nCap do: " + capDo;
    }
}
