import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        // Tính toán theo công thức
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong); // Tìm cạnh nhỏ nhất

        // Xuất kết quả
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ nhất: " + canhNho);
        
        scanner.close();
    }
}