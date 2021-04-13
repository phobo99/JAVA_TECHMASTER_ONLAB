import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double x1, x2;
        System.out.println("Nhập a, b và c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double delta = Math.pow(b, 2)-4*a*c;
        if(a == 0){
            System.out.println("Phương trình không có nghiệm");
        }
        else if (delta == 0 ){
            x1 = x2 = -(b/a*a);
            System.out.println("Phương trình có nghiệm kép là : x1 = x2 ="+x1);
        } else if (delta > 0){
            x1 = ( (-b) + Math.sqrt(delta)) / (a*a);
            x2 = ( (-b) - Math.sqrt(delta)) / (a*a);
            System.out.println("Phương trình có nghiệm là: x1 =" + x1 + " và x2=" + x2);
        } else if (a + b + c == 0){
            x1=1;
            x2=c/a;
            System.out.println("Phương trình có nghiệm là : x1 =" + x1 + " và x2 ="+ x2);
        } else if (a - b + c == 0){
            x1=-1;
            x2=-(c/a);
            System.out.println("Phương trình có nghiệm là : x1 =" + x1 + " và x2 ="+ x2);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
        input.close();
    }
}
