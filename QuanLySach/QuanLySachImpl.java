package QuanLySach;

import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("✅ Đã thêm sách: " + sach.getTieuDe());
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach sachCanXoa = timSach(maSach); 
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("✅ Đã xóa sách có mã: " + maSach);
            return true;
        }
        System.out.println("❌ Không tìm thấy sách có mã: " + maSach);
        return false;
    }

    @Override
    public boolean capNhatSach(String maSach, String tieuDeMoi, String tacGiaMoi, int namXuatBanMoi, int soLuongMoi) {
        Sach sachCanCapNhat = timSach(maSach); 
        if (sachCanCapNhat != null) {
            sachCanCapNhat.setTieuDe(tieuDeMoi);
            sachCanCapNhat.setTacGia(tacGiaMoi);
            sachCanCapNhat.setNamXuatBan(namXuatBanMoi);
            sachCanCapNhat.setSoLuong(soLuongMoi);
            System.out.println("✅ Đã cập nhật sách có mã: " + maSach);
            return true;
        }
        System.out.println("❌ Không tìm thấy sách có mã: " + maSach);
        return false;
    }

    @Override
    public Sach timSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null; 
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("❗ Danh sách sách đang trống!");
        } else {
            System.out.println("\n📚 --- DANH SÁCH SÁCH TRONG KHO --- 📚");
            for (Sach sach : danhSachSach) {
                System.out.println(sach.toString());
                System.out.println("-------------------------------------------------");
            }
        }
    }
}