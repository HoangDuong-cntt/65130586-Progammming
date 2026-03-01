import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NhatKyCaNhan {
    // Tên file lưu trữ nhật ký
    private static final String FILE_NAME = "nhatky.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\nNHẬT KÝ CÁ NHÂN");
            System.out.println("1. Viết nhật ký mới");
            System.out.println("2. Xem lại nhật ký");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            luaChon = sc.nextInt();
            sc.nextLine(); // Xóa bộ nhớ đệm

            switch (luaChon) {
                case 1:
                    vietNhatKy(sc);
                    break;
                case 2:
                    docNhatKy();
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (luaChon != 0);

        sc.close();
    }

    // Hàm ghi nội dung vào file
    public static void vietNhatKy(Scanner sc) {
        try {
            // true: cho phép ghi tiếp vào cuối file (append) thay vì ghi đè
            FileWriter writer = new FileWriter(FILE_NAME, true);
            
            // Lấy thời gian hiện tại
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            
            System.out.println("Nhập nội dung nhật ký (Nhấn Enter để lưu):");
            String noiDung = sc.nextLine();

            writer.write("[" + dtf.format(now) + "]\n");
            writer.write(noiDung + "\n");
            
            
            writer.close();
            System.out.println("Đã lưu nhật ký thành công!");
        } catch (IOException e) {
            System.out.println("Có lỗi khi ghi file: " + e.getMessage());
        }
    }

    // Hàm đọc nội dung từ file
    public static void docNhatKy() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("Bạn chưa có dòng nhật ký nào!");
            return;
        }

        try {
            Scanner fileReader = new Scanner(file);
            System.out.println("\nNỘI DUNG NHẬT KÝ");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
            fileReader.close();
            System.out.println(" HẾT");
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file: " + e.getMessage());
        }
    }
}