import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Mazda");
        // in ra man hinh
        System.out.println(cars);

        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println(cars.size());

        System.out.println(cars.get(1));

        // sua
        cars.set(2, "Toyota");
        System.out.println(cars);

        cars.remove("Toyota");
        System.out.println(cars);

        cars.remove(1);
        System.out.println(cars);

        // clear
        // cars.clear();
        // System.out.println(cars);

        ////

        ArrayList<String> cars2 = new ArrayList<String>();
        cars2.add("Ford");
        cars2.add("BMW");

        cars.addAll(cars2);
        System.out.println(cars);

        cars.addAll(2, cars2);
        System.out.println(cars);

        cars.retainAll(cars2);
        System.out.println(cars);

        System.out.println(cars.lastIndexOf("Ford"));

        ///

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        System.out.println(arr);

        ///

        ArrayList<Integer> arr4 = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            arr4.add(i);
        }
        System.out.println(arr4);

        ///

        ArrayList<Integer> arr5 = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i += 2) {
            arr5.add(i);
        }
        System.out.println(arr5);

        ///

        ArrayList<String> arr6 = new ArrayList<String>();
        arr6.add("Volvo");
        arr6.add("Audi");
        arr6.add("Mazda");
        arr6.add("Volvo");
        arr6.add("Audi");
        arr6.add("Mazda");
        int count = 0;
        for (int i = 0; i < arr6.size(); i++) {
            if (arr6.get(i).equals("Volvo")) {
                count++;
            }
        }
        System.out.println(count);
        
        ArrayList<Student> listStudent = new ArrayList<Student>();
        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            student.input();
            listStudent.add(student);
        }

        for (Student student : listStudent) {
            System.out.println(student);
        }
    }

}
