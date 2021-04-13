import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("hehe", 23, "CB", 9);
        student.display();
        Teacher teacher = new Teacher("Ngoc", 20, "HG", 1000000000f);
        teacher.display();
        System.out.println(teacher.salary);


        Person person = new Person("Loan", 20 , "Ha Noi");
        Person person2 = new Person("Hung", 22, "CB");

        person.sum(5, 5);
        person.sum(5, 5, 5);
        person.sum(5.5f, 6.5f);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tuổi: ");
        int tuoi = Integer.valueOf(scanner.nextLine());

        System.out.println("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();

        System.out.println("Nhập tên: ");
        String ten = scanner.nextLine();


        person.setName(ten);
        person.setAge(tuoi);
        person.setAddress(diaChi);


        person.display();
        person.move();
        person2.display();
    }
}