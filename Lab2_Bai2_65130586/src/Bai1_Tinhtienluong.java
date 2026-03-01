import java.util.Scanner;

public class Bai1_Tinhtienluong {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Khai báo các biến và kiểu dữ liệu
        double soGioLam;
        double luongMoiGio;
        double tongLuong;

        // Nhập dữ liệu
        System.out.print("Nhập số giờ làm việc: ");
        soGioLam = sc.nextDouble();

        System.out.print("Nhập lương mỗi giờ: ");
        luongMoiGio = sc.nextDouble();

        // Tính toán tiền lương với điều kiện (Overtime)
        if (soGioLam <= 40) {
            // làm việc bình thường
            tongLuong = soGioLam * luongMoiGio;
        } else {
            // làm trên 40 giờ
            double gioChuan = 40;
            double gioTangCa = soGioLam - 40;
            
            // Công thức
            tongLuong = (gioChuan * luongMoiGio) + (gioTangCa * luongMoiGio * 1.5);
        }

        // Xuất kết quả
        System.out.println(" KẾT QUẢ ");
        System.out.printf("Tổng tiền lương nhận được là: %.2f\n", tongLuong);
        
        sc.close();
    }
}