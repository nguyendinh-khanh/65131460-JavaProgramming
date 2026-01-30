import java.util.Scanner;
public class DoiTien {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        //khai báo biến không thay đổi
        final double USD = 23500;
        final double EUR = 27000;
       
        System.out.print("Nhap so tien can doi: ");
        double soTien = scanner.nextDouble();
        
        // Tính theo USD
        double UsdSangVnd = soTien * USD;
        System.out.printf("Tu %.2f USD sang VND bang %,.0f VND\n", soTien, UsdSangVnd);

        // Tính theo EUR
        double EurSangVnd = soTien * EUR;
        System.out.printf("Tu %.2f EUR sang VND bang %,.0f VND\n", soTien, EurSangVnd);
    }
}
