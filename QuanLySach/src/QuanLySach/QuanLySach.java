package QuanLySach;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    // Them sach
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("Da them sach: " + sach.getTieuDe());
    }

    // Xoa sach theo ma
    public void xoaSach(String maSach) {
        boolean xoaDuoc = danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
        if (xoaDuoc)
            System.out.println("Da xoa sach co ma: " + maSach);
        else
            System.out.println("Khong tim thay sach de xoa!");
    }

    // Cap nhat so luong sach
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setSoLuong(soLuongMoi);
                System.out.println("Da cap nhat so luong cho sach: " + s.getTieuDe());
                return;
            }
        }
        System.out.println("Khong tim thay sach de cap nhat!");
    }

    // Tim kiem sach theo ma
    public Sach timKiem(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    // Hien thi danh sach
    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach sach hien dang trong!");
        } else {
            System.out.println("DANH SACH SACH HIEN CO:");
            for (Sach s : danhSach) {
                System.out.println(s.toString());
                System.out.println("------------------------------");
            }
        }
    }
}
