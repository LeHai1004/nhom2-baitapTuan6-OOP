package QuanLySach;

public abstract class Sach {
    protected String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;

    // Constructor không tham số
    public Sach() {
    }

    // Constructor đầy đủ tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // Getter & Setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    // Phương thức trừu tượng
    public abstract double tinhGiaBan();

    public void hienThiThongTin() {
        System.out.println("----- Thông tin sách -----");
        System.out.println("Mã sách      : " + maSach);
        System.out.println("Tiêu đề      : " + tieuDe);
        System.out.println("Tác giả      : " + tacGia);
        System.out.println("Năm xuất bản : " + namXuatBan);
        System.out.println("Số lượng     : " + soLuong);
        System.out.println("Giá cơ bản   : " + giaCoBan + " VNĐ");
        System.out.println("Giá bán      : " + tinhGiaBan() + " VNĐ");
        System.out.println("---------------------------");
    }

    public String toString() {
        return "Mã sách: " + maSach +
                ", Tiêu đề: " + tieuDe +
                ", Tác giả: " + tacGia +
                ", Năm xuất bản: " + namXuatBan +
                ", Số lượng: " + soLuong +
                ", Giá cơ bản: " + giaCoBan;
    }
}
