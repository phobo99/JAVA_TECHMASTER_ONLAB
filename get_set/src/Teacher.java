public class Teacher extends Person{

    public float salary;
    public Teacher(String name, int age, String address, float salary) {
        super(name, age, address);
        this.salary = salary;
    }
    
}
