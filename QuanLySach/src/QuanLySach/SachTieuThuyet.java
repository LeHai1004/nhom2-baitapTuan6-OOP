public class SachTieuThuyet extends Sach {
    private String theLoai;
    private String series; // có thể là null hoặc chuỗi rỗng nếu không phải series

    public SachTieuThuyet() {}

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int soLuong, String viTri, double giaCoBan,
                          String theLoai, String series) {
        super(maSach, tieuDe, tacGia, soLuong, viTri, giaCoBan);
        this.theLoai = theLoai;
        this.series = series;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public String getSeries() { return series; }
    public void setSeries(String series) { this.series = series; }

    // Ví dụ logic: tiểu thuyết áp thuế 10%; nếu thuộc series, cộng thêm 2% phí bản quyền
    @Override
    public double tinhGiaBan() {
        double base = getGiaCoBan();
        double sauThue = base * 1.10; // +10% VAT
        if (series != null && !series.trim().isEmpty()) {
            sauThue = sauThue * 1.02; // +2% nếu là series
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
        return "SACH TIEU THUYET -> " + super.toString() +
               " | TheLoai: " + theLoai +
               " | Series: " + (series == null ? "" : series) +
               " | GiaBan: " + String.format("%.2f", tinhGiaBan());
    }
}
