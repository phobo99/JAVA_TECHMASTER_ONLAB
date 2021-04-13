import java.util.Scanner;

public class Animal {
    private String name;
    private int legNumber;
    private String sound;
    
    Scanner scanner = new Scanner(System.in);

    public Animal(String name, int legNumber, String sound) {
        this.name = name;
        this.legNumber = legNumber;
        this.sound = sound;
    }
    public Animal(){
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLegNumber() {
        return legNumber;
    }
    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public void input(){
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("So chan: ");
        legNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Tieng keu: ");
        sound = scanner.nextLine();
    }
    public String toString(){
        return "Ten: " + name + "\tSo chan: " + legNumber + "\tTieng keu: " +sound;
    }
}