import java.util.Scanner;
public class TinhLuong {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        // 1. Nhập liệu
        System.out.print("Nhap so gio lam: ");
        double soGio = scanner.nextDouble();
        System.out.print("Nhap luong theo gio (VND): ");
        double luongGio = scanner.nextDouble();

        double tongLuong = 0;
        // 2. Tính toán
        // Trường hợp làm ít hơn hoặc đúng 40h
        if (soGio < 40){
            tongLuong = soGio * luongGio;
        }
        // Trường hợp tăng ca (trên 40h)
        // Lương = (40h đầu * lương giờ) + (Giờ dư * 1.5)
        else tongLuong = (40 * luongGio) + ((soGio - 40) * luongGio * 1.5);

        System.out.printf("Tong luong nhan duoc: %,.0f VND\n", tongLuong);

    }
}
