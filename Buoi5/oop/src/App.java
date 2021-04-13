public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Loan", 20 , "Ha Noi");
        Person person2 = new Person("Hung", 22, "CB");
        // person.name = "Pho";
        // person.age = 22;
        // person.address = "Cao Bang";

        // System.out.println("Toi ten la "+person.name+" va toi " + person.age +" tuoi, toi toi tu "+person.address);
        person.display();
        person.move();
        person2.display();

        // Person person2 = new Person();
        // person2.name = "Hoang";

        // person2.study("English");
        // person2.favorite("choi game");

    }
}
