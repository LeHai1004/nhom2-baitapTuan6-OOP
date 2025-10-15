package QuanLySach;

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000.0 : 0.0);
    }

    @Override
    public String toString() {
        return "Sach tieu thuyet:" +
               "\nMa sach: " + getMaSach() +
               "\nTieu de: " + getTieuDe() +
               "\nTac gia: " + getTacGia() +
               "\nNam xuat ban: " + getNamXuatBan() +
               "\nSo luong: " + getSoLuong() +
               String.format("\nGia co ban: %.0f VND\nGia ban tinh duoc: %.0f VND", getGiaCoBan(), tinhGiaBan()) +
               "\nThe loai: " + theLoai +
               "\nThuoc series: " + (laSachSeries ? "Co" : "Khong");
    }
}
