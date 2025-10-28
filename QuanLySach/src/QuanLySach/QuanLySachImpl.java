import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private final List<Sach> dsSach;

    public QuanLySachImpl() {
        dsSach = new ArrayList<>();
    }

    @Override
    public boolean themSach(Sach sach) {
        // tránh trùng mã sách
        if (timKiemSachTheoMa(sach.getMaSach()) != null) {
            System.out.println("Ma sach da ton tai: " + sach.getMaSach());
            return false;
        }
        return dsSach.add(sach);
    }

    @Override
    public Sach timKiemSachTheoMa(String maSach) {
        for (Sach s : dsSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Sach> timKiemSachTheoTieuDe(String tuKhoa) {
        List<Sach> ketQua = new ArrayList<>();
        String tk = tuKhoa.toLowerCase();
        for (Sach s : dsSach) {
            if (s.getTieuDe().toLowerCase().contains(tk)) {
                ketQua.add(s);
            }
        }
        return ketQua;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSachTheoMa(maSach);
        if (s != null) {
            dsSach.remove(s);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        if (dsSach.isEmpty()) {
            System.out.println("Danh sách sách hiện đang trống.");
            return;
        }
        System.out.println("----- DANH SACH SACH -----");
        for (Sach s : dsSach) {
            System.out.println(s.toString());
        }
        System.out.println("-------------------------");
    }

    // Thêm tiện ích: trả về danh sách (nếu cần)
    public List<Sach> getDsSach() {
        return dsSach;
    }
}
