import java.util.Scanner;

public class Bai2_Quydoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo 
        final double TI_GIA_USD_VND = 23500;
        final double TI_GIA_EUR_VND = 27000;

        // Menu lựa chọn
        System.out.println("--- CHƯƠNG TRÌNH QUY ĐỔI TIỀN TỆ ---");
        System.out.println("1. USD sang VND");
        System.out.println("2. EUR sang VND");
        System.out.print("Vui lòng chọn loại tiền (1 hoặc 2): ");
        int luaChon = sc.nextInt();

        // Xử lý quy đổi
        double soTienNgoaiTe, thanhTienVND;

        if (luaChon == 1) {
            System.out.print("Nhập số tiền USD: ");
            soTienNgoaiTe = sc.nextDouble();
            thanhTienVND = soTienNgoaiTe * TI_GIA_USD_VND;
            System.out.printf("%.2f USD = %,.0f VND\n", soTienNgoaiTe, thanhTienVND);
        } else if (luaChon == 2) {
            System.out.print("Nhập số tiền EUR: ");
            soTienNgoaiTe = sc.nextDouble();
            thanhTienVND = soTienNgoaiTe * TI_GIA_EUR_VND;
            System.out.printf("%.2f EUR = %,.0f VND\n", soTienNgoaiTe, thanhTienVND);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }

        sc.close();
    }
}