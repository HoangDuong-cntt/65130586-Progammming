import java.util.Scanner;

public class Lab1_Bai4_Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số phương trình bậc 2 (ax^2 + bx + c):");
        
        // Nhập a, b, c
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        // Tính Delta = b^2 - 4ac
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Xuất Delta và Căn Delta
        // Lưu ý: Nếu delta âm thì căn delta sẽ ra NaN (Not a Number) trong toán học thực
        System.out.println("Delta: " + delta);
        System.out.println("Căn Delta: " + Math.sqrt(delta));
        
        scanner.close();
    }
}