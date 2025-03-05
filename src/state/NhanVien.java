package state;

public class NhanVien {
    private String ten;
    private int luongCoBan;
    private ChucVu chucVu;

    public NhanVien(String ten, int luongCoBan, ChucVu chucVu) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.chucVu = chucVu;
    }

    public int tinhThuNhap() {
        return luongCoBan + chucVu.tinhPhuCap();
    }

    @Override
    public String toString() {
        return "Tên: " + ten + ", Thu nhập: " + tinhThuNhap();
    }
}
