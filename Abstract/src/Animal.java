import java.util.Scanner;

public abstract class  Animal {
    private String name, gender, color;
    private int age;
    private float weight;
    Scanner scanner = new Scanner(System.in);

    public Animal(String name, String gender, String color, int age, float weight) {
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public Animal(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public abstract void eat(String food);
    public abstract float run(float speed);
    public abstract float sleep(float hours);
    public void input(){
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Gioi tinh: ");
        gender = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Can nang: ");
        weight = Float.parseFloat(scanner.nextLine());
        System.out.println("Mau sac: ");
        color = scanner.nextLine();
    }

    public String toString(){
        return "Ten: "+getName()+"\tGioi tinh: "+getGender()+"\tTuoi: "+getAge()+"\tMau sac: "+getColor();
    }


}
