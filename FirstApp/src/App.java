import java.net.SocketPermission;
import java.util.Scanner;

public class App {
    //Kiến thức ở trên lớp.
    public static void main(String[] args) throws Exception {
        //System.out.println("Tùng óc chó vcl");

        int a;
        a = 5;

        float b = 4.5f;         // nên để chữ f sau 

        double c = 4.5;         // có thể có chữ d hoặc không

        System.out.println(a + "\n" +c);      // lệnh in ra màn hình. viết tắt là sysout

        Season season = Season.SUMMER;
        System.out.println(season);


        double d=3, e=4;
        
        double f=Math.sqrt(Math.pow(d, 2)+Math.pow(e, 2));
        System.out.println("f = " +f);


        System.out.format("%f", b);
        System.out.format("%d\n", a);



        int day, month, year;
        day = 6;
        month = 10;
        year = 2021;
        System.out.printf("%02d/%02d/%04d", month, day, year);



        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Nhap a: ");
        x = Integer.valueOf(scanner.nextLine());
        System.out.println(a);

        double z;
        System.out.println("Nhap z: ");
        z = scanner.nextDouble();
        System.out.println(z);

        String s1;
        System.out.println("Nhap chuoi :");
        s1 = scanner.nextLine();
        System.out.println(s1);
        scanner.close();
    }
    
}

enum Season{
            SPRING, WINTER, AUTUMN, SUMMER;
}