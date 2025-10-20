package QuanLySach;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("✅ Đã thêm sách: " + sach.getTieuDe());
    }

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
        System.out.println("❌ Không tìm thấy sách có mã: " + maSach);
        return false;
    }

    public Sach timSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("❗ Danh sách sách đang trống!");
        } else {
            System.out.println("📚 DANH SÁCH SÁCH:");
            for (Sach sach : danhSachSach) {
                System.out.println(sach.toString());
                System.out.println("Giá bán ước tính: " + sach.tinhGiaBan() + " VNĐ");
                System.out.println("-------------------------------------------------");
            }
        }
    }
}
