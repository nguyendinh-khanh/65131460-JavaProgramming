import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double rong = scanner.nextDouble();
        // Tính toán
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);
        // Xuất kết quả
        System.out.printf("Chu vi: %.2f\n", chuVi);
        System.out.printf("Dien tich: %.2f\n", dienTich);
        System.out.printf("Canh nho nhat la: %.2f\n", canhNho);
    }
}