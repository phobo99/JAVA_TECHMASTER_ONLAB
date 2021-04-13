public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Mercedes", "Black", 50000);
        Car car2 = new Car("Roll Royce", "White", 8000000);
        Car car3 = new Car("Ferrari", "Pink", 150000);

        Cat cat1 = new Cat("ta", "Tam thể", "Cái");
        Cat cat2 = new Cat("ALN", "Khói xám", "Đực");
        Cat cat3 = new Cat("Trần Đức Bo", "Trắng", "Không xác định");

        System.out.println("-----------------------------");
        car1.display();
        car1.speed(200);

        System.out.println("-----------------------------");
        car2.display();
        car2.speed(250);

        System.out.println("---------------------------");
        car3.display();
        car3.speed(400);

        System.out.printf("\n\n\nLOÀI MÈO\n");
        System.out.println("---------------------------");
        cat1.display();
        cat1.chirp("Méo mèo meo");

        System.out.println("----------------------------");
        cat2.display();
        cat2.chirp("Gâu gâu");

        System.out.println("----------------------------");
        cat3.display();
        cat3.chirp("Mẹo méo mẹo mèo meo, con mèo ngu ngốc đáng yêu cute phô mai que");
    }
}
