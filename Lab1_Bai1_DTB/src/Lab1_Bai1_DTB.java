import java.util.Scanner;
public class Lab1_Bai1_DTB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập họ và tên sinh viên: ");
        String HoTen = input.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double  DiemTrung = input.nextDouble();
        System.out.printf("%s, Điểm trung bình: %.2f", HoTen, DiemTrung);
    }
}
