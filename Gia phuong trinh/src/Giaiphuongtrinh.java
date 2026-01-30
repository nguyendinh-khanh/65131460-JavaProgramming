import java.util.Scanner;
import java.util.InputMismatchException;
public class Giaiphuongtrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai phuong trinh: ax + b = 0");

        try {// Nhập a và b
            System.out.print("Nhap he so a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhap he so b: ");
            double b = scanner.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh co VO SO NGHIEM.");
                } else {
                    System.out.println("Phuong trinh VO NGHIEM.");
                }
            } else {
                // Công thức: x = -b / a
                double x = -b / a;
                System.out.printf("x = %.2f", x);
            }
        } catch (InputMismatchException e) {
            //xử lý khi nhập không đúng yêu cầu
            System.out.println("Loi: Vui long nhap so");
            System.out.println("Vui long chay lai chuong trinh.");
        }

    }
}
