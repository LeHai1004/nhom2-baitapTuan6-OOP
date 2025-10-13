package QuanLySach;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    // Thêm sách mới
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("✅ Đã thêm sách: " + sach.getTieuDe());
    }

    // Xóa sách theo mã
    public boolean xoaSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                danhSachSach.remove(sach);
                System.out.println("✅ Đã xóa sách có mã: " + maSach);
                return true;
            }
        }
        System.out.println("❌ Không tìm thấy sách có mã: " + maSach);
        return false;
    }

    // Cập nhật thông tin sách theo mã
    public boolean capNhatSach(String maSach, String tieuDeMoi, String tacGiaMoi, int namXuatBanMoi, int soLuongMoi) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                sach.setTieuDe(tieuDeMoi);
                sach.setTacGia(tacGiaMoi);
                sach.setNamXuatBan(namXuatBanMoi);
                sach.setSoLuong(soLuongMoi);
                System.out.println("✅ Đã cập nhật sách có mã: " + maSach);
                return true;
            }
        }
        System.out.println(" Không tìm thấy sách có mã: " + maSach);
        return false;
    }

    // Tìm sách theo mã
    public Sach timSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    // Hiển thị danh sách sách
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách đang trống!");
        } else {
            System.out.println(" DANH SÁCH SÁCH:");
            for (Sach sach : danhSachSach) {
                System.out.println(sach.toString());
            }
        }
    }
}
