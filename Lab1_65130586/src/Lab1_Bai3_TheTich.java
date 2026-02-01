import java.util.Scanner;

public class Lab1_Bai3_TheTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập cạnh của khối lập phương
        System.out.print("Nhập cạnh khối lập phương: ");
        double canh = scanner.nextDouble();

        // Tính thể tích: cạnh lập phương (mũ 3)
        // Cách 1: double theTich = canh * canh * canh;
        // Cách 2 (theo hướng dẫn): dùng Math.pow(cơ số, số mũ)
        double theTich = Math.pow(canh, 3);

        // Xuất kết quả
        System.out.println("Thể tích khối lập phương: " + theTich);
        
        scanner.close();
    }
}