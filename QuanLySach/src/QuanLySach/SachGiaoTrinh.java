public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo; // ví dụ: "Dai cuong", "Tien si", "Co ban"...

    public SachGiaoTrinh() {}

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int soLuong, String viTri, double giaCoBan,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, soLuong, viTri, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    // Ví dụ logic: sách giáo trình áp thuế 5%, nếu số lượng > 100 được giảm 3% trên giá bán (sau thuế)
    @Override
    public double tinhGiaBan() {
        double base = getGiaCoBan();
        double sauThue = base * 1.05; // +5% VAT
        if (getSoLuong() > 100) {
            sauThue = sauThue * 0.97; // giảm 3%
        }
        return Math.round(sauThue * 100.0) / 100.0;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        setViTri(viTriMoi);
        System.out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "SACH GIAO TRINH -> " + super.toString() +
               " | MonHoc: " + monHoc +
               " | CapDo: " + capDo +
               " | GiaBan: " + String.format("%.2f", tinhGiaBan());
    }
}
