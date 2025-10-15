package QuanLySach;

public abstract class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan; // thuộc tính mới

    public Sach() {}

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // getter / setter
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

    // phương thức abstract yêu cầu các lớp con triển khai
    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Ma sach: " + maSach +
               "\nTieu de: " + tieuDe +
               "\nTac gia: " + tacGia +
               "\nNam xuat ban: " + namXuatBan +
               "\nSo luong: " + soLuong +
               String.format("\nGia co ban: %.0f VND\nGia ban tinh duoc: %.0f VND", giaCoBan, tinhGiaBan());
    }

    // phương thức hiển thị (giữ tương tự)
    public void hienThiThongTin() {
        System.out.println(this.toString());
        System.out.println("----------------------------");
    }
}
