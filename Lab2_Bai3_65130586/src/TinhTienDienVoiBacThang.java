import java.util.Scanner;

public class TinhTienDienVoiBacThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Khai báo biến
        double soKwh, tongTien = 0;

        // Nhập số điện tiêu thụ
        System.out.print("Nhập số điện tiêu thụ trong tháng (kWh): ");
        while (!sc.hasNextDouble()) {
            System.out.println("Vui lòng nhập một con số hợp lệ!");
            sc.next(); 
        }
        soKwh = sc.nextDouble();

        // Logic tính tiền theo bậc thang
        // Bậc 1: 0 - 50 kWh (Giá: 1.678)
        // Bậc 2: 51 - 100 kWh (Giá: 1.734)
        // Bậc 3: 101 - 200 kWh (Giá: 2.014)
        // Bậc 4: Trên 200 kWh (Giá: 2.536) - Rút gọn cho dễ hiểu

        if (soKwh <= 50) {
            tongTien = soKwh * 1678;
        } else if (soKwh <= 100) {
            tongTien = (50 * 1678) + (soKwh - 50) * 1734;
        } else if (soKwh <= 200) {
            tongTien = (50 * 1678) + (50 * 1734) + (soKwh - 100) * 2014;
        } else {
            tongTien = (50 * 1678) + (50 * 1734) + (100 * 2014) + (soKwh - 200) * 2536;
        }

        //  Cộng thêm 10% thuế VAT
        double thueVAT = tongTien * 0.1;
        double tongPhaiTra = tongTien + thueVAT;

        //  Xuất kết quả
        System.out.printf("Tiền điện chưa thuế: %,.0f VND\n", tongTien);
        System.out.printf("Thuế VAT (10%%):      %,.0f VND\n", thueVAT);
        System.out.printf("TỔNG CỘNG PHẢI TRẢ:  %,.0f VND\n", tongPhaiTra);
       
        sc.close();
    }
}