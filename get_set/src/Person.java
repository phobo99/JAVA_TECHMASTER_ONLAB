public class Person {
    private String name;
    private int age;
    private String address;
    static String college = "Techmaster";
    public static void change(){
        college = "CNTT";
    }
    static {
        System.out.println("Gọi tới khối static");
    }

    private Person(){
        System.out.println("Goi toi constructor");
    }
    public Person(String name, int age, String address){
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


    // chồng 
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void sum(float a, float b){
        System.out.println(a+b);
    }


    //get set
    
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}