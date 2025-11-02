package QuanLySach;

import java.util.HashMap;
import java.util.Map;

public class QuanLySach {
    private Map<String, Sach> danhSachSach = new HashMap<>();

    public void themSach(Sach sach) {
        if (danhSachSach.containsKey(sach.getMaSach())) {
            System.out.println("⚠️ Sách có mã " + sach.getMaSach() + " đã tồn tại!");
            return;
        }
        danhSachSach.put(sach.getMaSach(), sach);
        System.out.println("✅ Đã thêm sách: " + sach.getTieuDe());
    }

    public boolean xoaSach(String maSach) {
        if (danhSachSach.remove(maSach) != null) {
            System.out.println("✅ Đã xóa sách có mã: " + maSach);
            return true;
        }
        System.out.println("❌ Không tìm thấy sách có mã: " + maSach);
        return false;
    }

    public boolean capNhatSach(String maSach, String tieuDeMoi, String tacGiaMoi, int namXuatBanMoi, int soLuongMoi) {
        Sach sach = danhSachSach.get(maSach);
        if (sach != null) {
            sach.setTieuDe(tieuDeMoi);
            sach.setTacGia(tacGiaMoi);
            sach.setNamXuatBan(namXuatBanMoi);
            sach.setSoLuong(soLuongMoi);
            System.out.println("✅ Đã cập nhật sách có mã: " + maSach);
            return true;
        }
        System.out.println("❌ Không tìm thấy sách có mã: " + maSach);
        return false;
    }

    public Sach timSach(String maSach) {
        return danhSachSach.get(maSach);
    }

    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("❗ Danh sách sách đang trống!");
        } else {
            System.out.println("📚 DANH SÁCH SÁCH:");
            for (Sach sach : danhSachSach.values()) {
                System.out.println(sach.toString());
                System.out.println("Giá bán ước tính: " + sach.tinhGiaBan() + " VNĐ");
                System.out.println("-------------------------------------------------");
            }
        }
    }
}
