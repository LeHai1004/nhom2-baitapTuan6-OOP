package QuanLySach;

public class Test {
    public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();

        SachGiaoTrinh sgk = new SachGiaoTrinh("SGK1", "Giáo Trình Java", "Nguyễn Văn A", 2021, 20, 50000, "Lập trình", "Đại học");
        SachTieuThuyet stt = new SachTieuThuyet("STT1", "Đắc Nhân Tâm", "Dale Carnegie", 2018, 15, 60000, "Kỹ năng sống", true);

        qls.themSach(sgk);
        qls.themSach(stt);

        // Hiển thị tất cả sách
        qls.hienThiDanhSach();

        // Interface kiểm tra tồn kho
        IKiemKe kiemKe1 = sgk;
        IKiemKe kiemKe2 = stt;

        System.out.println("\n--- Kiểm tra tồn kho & cập nhật vị trí ---");
        System.out.println("Giáo trình tồn kho >= 10? " + kiemKe1.kiemTraTonKho(10));
        kiemKe1.capNhatViTri("Kho A1 - Kệ 3");

        System.out.println("Tiểu thuyết tồn kho >= 20? " + kiemKe2.kiemTraTonKho(20));
        kiemKe2.capNhatViTri("Kho B2 - Kệ 5");
    }
}
