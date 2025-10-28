public abstract class Sach implements IGiaBan, IKiemKe {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int soLuong;
    private String viTri;
    private double giaCoBan;

    public Sach() {}

    public Sach(String maSach, String tieuDe, String tacGia, int soLuong, String viTri, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.soLuong = soLuong;
        this.viTri = viTri;
        this.giaCoBan = giaCoBan;
    }

    // Getters & Setters
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public String getViTri() { return viTri; }
    public void setViTri(String viTri) { this.viTri = viTri; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    // Các phương thức trừu tượng từ interface sẽ được lớp con triển khai
    @Override
    public abstract double tinhGiaBan();

    @Override
    public abstract boolean kiemTraTonKho(int soLuongToiThieu);

    @Override
    public abstract void capNhatViTri(String viTriMoi);

    @Override
    public String toString() {
        return "Ma: " + maSach +
               " | TieuDe: " + tieuDe +
               " | TacGia: " + tacGia +
               " | SoLuong: " + soLuong +
               " | ViTri: " + viTri +
               " | GiaCoBan: " + String.format("%.2f", giaCoBan);
    }
}
