import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so pets: ");
        int n = scanner.nextInt();

        Pets[] pets = new Pets[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap pet thu " + (i + 1) + ":");
            pets[i] = new Pets();
            pets[i].input();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(pets[i].toString());
            /*
            neu muon goi toi abstract thi ta dung nhu sau
            pets[i].sleep(50);
            */
        }
    }
}
