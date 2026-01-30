import java.util.Scanner;

public class Lab1_Bai4_Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so phuong trinh bac 2 (ax^2 + bx + c)");

        try {
            System.out.print("Nhap a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhap b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhap c: ");
            double c = scanner.nextDouble();

            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Delta < 0 nen khong co Can Delta.");
            } else {
                double canDelta = Math.sqrt(delta);
                System.out.printf("Can Delta: %.2f\n", canDelta);
            }

        } catch (Exception e) {
            System.out.println("Loi: Vui long chi nhap so");
        }
    }
}
