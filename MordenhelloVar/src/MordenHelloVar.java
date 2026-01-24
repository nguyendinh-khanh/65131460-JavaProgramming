public class MordenHelloVar {
    public static void main(String[] args){
        // var - tự động suy luận kiểu
        var name = "Nguyen Dinh Khanh";
        var mssv = 65131460;
        var monHoc = java.util.List.of("Java", "Cau Truc Du Lieu", "Winform");

        System.out.println("Xin chao, toi la: " + name);
        System.out.println("MSSV cua toi: " + mssv);
        System.out.println("Cac mon dang hoc: " + monHoc);
    }
}
