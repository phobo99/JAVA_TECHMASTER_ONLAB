public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    public FullTimeEmployee() {
    }

    public int calculatorSalary() {
        return 8 * getPaymentPerHour();
    }
}
