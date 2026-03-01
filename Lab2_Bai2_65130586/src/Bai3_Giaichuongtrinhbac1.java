import java.util.Scanner;
import java.util.InputMismatchException;

public class Bai3_Giaichuongtrinhbac1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0;
        boolean check = false;

        // Xử lý ngoại lệ khi nhập liệu 
        while (!check) {
            try {
                System.out.print("Nhập hệ số a: ");
                a = sc.nextDouble();
                System.out.print("Nhập hệ số b: ");
                b = sc.nextDouble();
                check = true; // Nếu nhập đúng số, thoát khỏi vòng lặp
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn phải nhập vào một con số thực!");
                sc.nextLine(); // Xóa bộ nhớ đệm để nhập lại
            }
        }

        //Logic giải phương trình ax + b = 0
        System.out.println("\n KẾT QUẢ ");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            // Công thức: x = -b / a
            double x = -b / a;
            // Định dạng đầu ra với printf
            System.out.printf("Phương trình %.2fx + %.2f = 0\n", a, b);
            System.out.printf("=> Nghiệm x = %.2f\n", x);
        }

        sc.close();
    }
}