public class App {
    public static void main(String[] args) throws Exception {
        IEmployee employee1 = new PartTimeEmployee("AAA",200000,5);
        System.out.println(employee1.getName());
        System.out.println(employee1.calculatorSalary());
        
        IEmployee employee2 = new FullTimeEmployee("BBB",200000);
        System.out.println(employee2.getName());
        System.out.println(employee2.calculatorSalary());
