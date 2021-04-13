import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    Scanner scanner = new Scanner(System.in);
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void input(){
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
    }
    public String toString() {
        return name +"\t" +age;
    }
}
