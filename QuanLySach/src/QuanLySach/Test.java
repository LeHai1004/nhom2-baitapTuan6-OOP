import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);

        // Thêm một vài sách mẫu
        quanLy.themSach(new SachGiaoTrinh("GT001", "Lap trinh Java", "Nguyen Van A", 120, "A1-01", 150000, "CNTT", "Dai cuong"));
        quanLy.themSach(new SachGiaoTrinh("GT002", "Co so du lieu", "Tran Thi B", 80, "A1-02", 180000, "CNTT", "Nang cao"));
        quanLy.themSach(new SachTieuThuyet("TT001", "Nguoi trong giang ho", "Kim Dung", 50, "B2-01", 90000, "Vu truong", "Series A"));
        quanLy.themSach(new SachTieuThuyet("TT002", "Dai gia", "F. Scott", 30, "B2-02", 120000, "Kinh dien", ""));

        boolean running = true;
        while (running) {
            System.out.println("\n=== QUAN LY SACH - MENU ===");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim sach (theo ma)");
            System.out.println("4. Tim sach (theo tieu de)");
            System.out.println("5. Xoa sach (theo ma)");
            System.out.println("6. Kiem tra ton kho");
            System.out.println("7. Cap nhat vi tri sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    themSachMenu(quanLy, sc);
                    break;
                case "2":
                    quanLy.hienThiDanhSach();
                    break;
                case "3":
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine().trim();
                    Sach s = quanLy.timKiemSachTheoMa(ma);
                    if (s != null) System.out.println(s);
                    else System.out.println("Khong tim thay sach co ma: " + ma);
                    break;
                case "4":
                    System.out.print("Nhap tu khoa tieu de: ");
                    String tk = sc.nextLine().trim();
                    List<Sach> ketQua = quanLy.timKiemSachTheoTieuDe(tk);
                    if (ketQua.isEmpty()) System.out.println("Khong co ket qua.");
                    else for (Sach x : ketQua) System.out.println(x);
                    break;
                case "5":
                    System.out.print("Nhap ma sach muon xoa: ");
                    String maX = sc.nextLine().trim();
                    if (quanLy.xoaSach(maX)) System.out.println("Da xoa ma: " + maX);
                    else System.out.println("Xoa that bai, khong tim thay ma: " + maX);
                    break;
                case "6":
                    System.out.print("Nhap ma sach: ");
                    String mCheck = sc.nextLine().trim();
                    Sach sCheck = quanLy.timKiemSachTheoMa(mCheck);
                    if (sCheck == null) {
                        System.out.println("Khong tim thay sach: " + mCheck);
                    } else {
                        System.out.print("Nhap so luong toi thieu can kiem tra: ");
                        try {
                            int sluong = Integer.parseInt(sc.nextLine().trim());
                            boolean ok = sCheck.kiemTraTonKho(sluong);
                            System.out.println(ok ? "Ton kho du." : "Khong du so luong.");
                        } catch (NumberFormatException e) {
                            System.out.println("Gia tri nhap vao khong hop le.");
                        }
                    }
                    break;
                case "7":
                    System.out.print("Nhap ma sach: ");
                    String mUpd = sc.nextLine().trim();
                    Sach sUpd = quanLy.timKiemSachTheoMa(mUpd);
                    if (sUpd == null) {
                        System.out.println("Khong tim thay sach: " + mUpd);
                    } else {
                        System.out.print("Nhap vi tri moi: ");
                        String v = sc.nextLine().trim();
                        sUpd.capNhatViTri(v);
                    }
                    break;
                case "0":
                    running = false;
                    System.out.println("Thoat chuong trinh. Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Thu lai.");
            }
        }

        sc.close();
    }

    private static void themSachMenu(IQuanLySach quanLy, Scanner sc) {
        System.out.println("Chon loai sach: 1 - Giao trinh, 2 - Tieu thuyet");
        String loai = sc.nextLine().trim();
        System.out.print("Ma sach: "); String ma = sc.nextLine().trim();
        System.out.print("Tieu de: "); String td = sc.nextLine().trim();
        System.out.print("Tac gia: "); String tg = sc.nextLine().trim();
        System.out.print("So luong: "); int sl = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Vi tri: "); String vt = sc.nextLine().trim();
        System.out.print("Gia co ban: "); double gb = Double.parseDouble(sc.nextLine().trim());

        if ("1".equals(loai)) {
            System.out.print("Mon hoc: "); String mon = sc.nextLine().trim();
            System.out.print("Cap do: "); String cap = sc.nextLine().trim();
            SachGiaoTrinh g = new SachGiaoTrinh(ma, td, tg, sl, vt, gb, mon, cap);
            if (quanLy.themSach(g)) System.out.println("Da them giao trinh.");
        } else {
            System.out.print("The loai: "); String theloai = sc.nextLine().trim();
            System.out.print("Series (neu co, neu khong de rong): "); String series = sc.nextLine().trim();
            SachTieuThuyet t = new SachTieuThuyet(ma, td, tg, sl, vt, gb, theloai, series);
            if (quanLy.themSach(t)) System.out.println("Da them tieu thuyet.");
        }
    }
}
