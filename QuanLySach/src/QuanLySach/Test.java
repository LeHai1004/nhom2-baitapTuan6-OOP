package QuanLySach;

public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh giaoTrinh = new SachGiaoTrinh(
                "GT01", "Lap trinh Java", "Nguyen Van A", 2023, 10,
                "Cong nghe thong tin", "Dai hoc");

        SachTieuThuyet tieuThuyet = new SachTieuThuyet(
                "TT01", "Harry Potter", "J.K. Rowling", 2000, 50,
                "Phieu luu", true);

        // Them sach
        ql.themSach(giaoTrinh);
        ql.themSach(tieuThuyet);

        // Hien thi
        System.out.println("\n=== DANH SACH BAN DAU ===");
        ql.hienThiTatCa();

        // Cap nhat
        System.out.println("\n=== CAP NHAT SO LUONG ===");
        ql.capNhatSoLuong("TT01", 100);
        ql.hienThiTatCa();

        // Xoa
        System.out.println("\n=== XOA SACH CO MA GT01 ===");
        ql.xoaSach("GT01");
        ql.hienThiTatCa();

        // Tim kiem
        System.out.println("\n=== TIM KIEM SACH THEO MA TT01 ===");
        Sach ketQua = ql.timKiem("TT01");
        if (ketQua != null) {
            System.out.println("Tim thay:\n" + ketQua.toString());
        } else {
            System.out.println("Khong tim thay sach!");
        }
    }
}

    