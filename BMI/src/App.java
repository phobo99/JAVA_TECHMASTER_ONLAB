import java.util.Scanner;

public class App {
    //Bài tập in ra màn hình chỉ số BMI và thông báo ra chỉ số cân đối.
    public static void main(String[] args) throws Exception {
        double height;
        double weight;
        double bmi;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap chieu cao: ");
        height = scanner.nextDouble();
        System.out.println("Nhap can nang: ");
        weight = scanner.nextDouble();

        bmi = weight / (height*height);

        System.out.printf("Chi so BMI cua ban la : %1.2f \n", bmi);
        scanner.close();

        if (bmi < 18.5) {
            System.out.println("Bạn đang thiếu cân");
        }else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Chỉ số của bạn là cân đối");
        } else {
            System.out.println("Bạn đang thừa cân đó nhé!");
        }
        
    }
}