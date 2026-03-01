import java.util.Scanner;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        // Khai báo hằng số tỉ giá (Cố định giá trị)
        final double TI_GIA = 24500.0; // 1 USD = 24,500 VND

        Scanner sc = new Scanner(System.in);

        // Hiển thị Menu lựa chọn
        System.out.println(" QUY ĐỔI TIỀN TỆ ");
        System.out.println("1. Đổi từ USD sang VND");
        System.out.println("2. Đổi từ VND sang USD");
        System.out.print("Chọn phương thức (1 hoặc 2): ");
        int luaChon = sc.nextInt();

        // Xử lý logic quy đổi
        double usd, vnd;

        switch (luaChon) {
            case 1:
                System.out.print("Nhập số tiền USD muốn đổi: ");
                usd = sc.nextDouble();
                vnd = usd * TI_GIA;
                // Định dạng xuất: %,.2f giúp hiển thị dấu phân cách hàng nghìn
                System.out.printf("==> %.2f USD = %,.0f VND\n", usd, vnd);
                break;

            case 2:
                System.out.print("Nhập số tiền VND muốn đổi: ");
                vnd = sc.nextDouble();
                usd = vnd / TI_GIA;
                System.out.printf("==> %,.0f VND = %.2f USD\n", vnd, usd);
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chạy lại chương trình!");
                break;
        }

 
        sc.close();
    }
}