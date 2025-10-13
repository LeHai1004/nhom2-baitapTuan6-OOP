package QuanLySach;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor đầy đủ
        Sach sach1 = new Sach("B001", "Lập Trình Java OOP", "Nguyễn Văn A", 2021, 10);

        // Tạo đối tượng bằng constructor rỗng rồi set từng giá trị
        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Lập Trình OOP");
        sach2.setTacGia("Trần Thị B");
        sach2.setNamXuatBan(2020);
        sach2.setSoLuong(5);
        // Hiển thị thông tin
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
        SachGiaoTrinh sgk = new SachGiaoTrinh( "SGK1", "Sach giao khoa" ,"Nguyen van a" , 2022 ,5 ," Tiếng việt","Đại Học");
       System.out.println(sgk);
       	SachTieuThuyet stt = new SachTieuThuyet("STT01","Robinson phiêu lưu ký","Adam",2000,100,"Phiêu lưu",true);
    	System.out.println(stt);
    	//Tuần 6
    	QuanLySach qls = new QuanLySach();
        Sach s1 = new Sach("S01", "Java Cơ Bản", "Nguyễn Văn A", 2020, 10);
        Sach s2 = new Sach("S02", "OOP Trong Java", "Trần Thị B", 2021, 5);
        qls.themSach(s1);
        qls.themSach(s2);
        qls.hienThiDanhSach();
        Sach tim = qls.timSach("S01");
        if (tim != null) {
            System.out.println(" Tìm thấy sách: ");
            tim.hienThiThongTin();
        } else {
            System.out.println(" Không tìm thấy sách");
        }
        qls.capNhatSach("S02", "Lập Trình Hướng Đối Tượng", "Trần Thị B", 2023, 7);

        qls.xoaSach("S01");

        qls.hienThiDanhSach();
    
    }	
}
