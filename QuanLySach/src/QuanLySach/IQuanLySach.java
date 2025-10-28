import java.util.List;

public interface IQuanLySach {
    boolean themSach(Sach sach);
    Sach timKiemSachTheoMa(String maSach);
    List<Sach> timKiemSachTheoTieuDe(String tuKhoa);
    boolean xoaSach(String maSach);
    void hienThiDanhSach();
}
