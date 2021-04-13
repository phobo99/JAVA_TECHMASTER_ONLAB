public class Person {
    public String name;
    public int age;
    public String address;
    public Person(){
        System.out.println("Goi toi constructor");
    }
    public Person(String name, int age, String addres){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    
    public void move(){
        System.out.println("Phuong thuc move");
        System.out.println(name + " study English");
    }
    public void study(String subject){
        System.out.println("Phuong thuc study");
        System.out.println(name + " study " + subject);
    }
    public void favorite(String like){
        System.out.println("Phuong thuc favorite");
        System.out.println(name + " rat thich " + like);
    }
    public String getName(){
        return this.name;
    }
    public void display(){
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("Dia chi: "+address);
    }
}