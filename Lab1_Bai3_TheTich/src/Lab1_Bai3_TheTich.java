import java.util.Scanner;

public class Lab1_Bai3_TheTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh cua khoi lap phuong: ");
        double Canh = scanner.nextDouble();

        double TheTich = Math.pow(Canh, 3);
        System.out.printf("The tich cua khoi lap phuong la %.2f",TheTich);
    }
}
