import java.util.Scanner;

public class MainNoPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên nhân viên: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        int luongCoBan = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chức vụ (Tien Si, Truong Phong, To Truong): ");
        String chucVu = scanner.nextLine();

        int phuCap = 0;
        if (chucVu.equals("Tien Si")) {
            phuCap = 500;
        } else if (chucVu.equals("Truong Phong")) {
            phuCap = 700;
        } else if (chucVu.equals("To Truong")) {
            phuCap = 300;
        }

        int tongThuNhap = luongCoBan + phuCap;
        System.out.println("Thu nhập của " + ten + ": " + tongThuNhap);
    }
}
