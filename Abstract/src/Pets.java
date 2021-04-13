public class Pets extends Animal {
    public String food;
    public float speed, hours;

    public Pets(String name, String gender, String color, int age, float weight) {
        super(name, gender, color, age, weight);
    }

    public Pets() {

    }

    @Override
    public void input() {
        super.input();
        System.out.println("Thuc an: ");
        food = scanner.nextLine();
        System.out.println("Toc do chay: ");
        speed = Float.parseFloat(scanner.nextLine());
        System.out.println("So gio ngu: ");
        hours = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + "an " + food);
    }

    @Override
    public float run(float speed) {
        return speed;
    }

    @Override
    public float sleep(float hours) {
        return hours;
    }

    @Override
    public String toString() {
        return super.toString()+"\tAn: "+food+"\tToc do: "+speed+"/h"+"\tSo gio ngu: "+hours+"/day";
    }
}
