import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println(" Nhập a và b: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        if (a==0) {
            if (b==0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            float x= -(b/a);
            System.out.println("Phương trình có nghiệm là : " + x);
        }
        input.close();

    }
}
