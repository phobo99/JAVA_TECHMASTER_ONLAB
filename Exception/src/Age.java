import java.util.Scanner;

public class Age {
    public static void main(String[] args) throws Exception{
        try {
            int tuoi = nhapTuoi();
            System.out.println("Tuoi vua nhap la: "+tuoi);
        }catch (Exception e) {
            System.out.println("Nhap sai!");
        }
    }
    public static int nhapTuoi() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao tuoi");
        int age = scanner.nextInt();
        if (age < 0) throw new Exception("Tuoi khong duoc nho hon 0");
        return age;

    }
}
