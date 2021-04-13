import java.util.Scanner;
public class App {
    //Bài tập nhập vào tên, tuổi, địa chỉ và in ra màn hình thông tin đó
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Address: ");
        String add = scanner.nextLine();
        System.out.println("Tên bạn là " +name + ", "+ age + " Tuổi và " + "tôi ở"+add);
        scanner.close();
    }
}
