import java.util.Scanner;

public class Lab1_Bai1_DTB {
    public static void main(String[] args) {
        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();

        // Xuất ra màn hình theo định dạng yêu cầu (dùng printf)
        // %s là chỗ để điền chuỗi (hoTen), %f là chỗ điền số thực (diemTB)
        System.out.printf("%s %.2f điểm", hoTen, diemTB);
        
        // %.2f nghĩa là làm tròn điểm đến 2 chữ số thập phân cho đẹp (tùy chọn)
        
        scanner.close();
    }
}