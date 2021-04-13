import java.util.ArrayList;
import java.util.Arrays;

interface Converter<F, T> {
    T convert(F from);
}

public class LambdaExample {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(5);
        number.add(6);
        number.add(4);
        number.add(9);
        number.add(5);

        number.forEach((n) -> {
            System.out.println(n);
        });

        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("AAA", 30));
        listPerson.add(new Person("BBB", 20));
        listPerson.add(new Person("CCC", 50));
        listPerson.add(new Person("DDD", 40));
        listPerson.add(new Person("EEE", 25));

        listPerson.forEach(person -> System.out.println(person.name + " - " + person.age));


        // Vi du ep kieu
        int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        System.out.println(stringConverter.convert(2));


        String[] strArray = {"Java", "C", "Ruby", "Python", "Javascript","html"};
        Arrays.sort(strArray, String::compareToIgnoreCase);       //compareTo se day "html" xuong cuoi
        for(String str : strArray){
            System.out.println(str);
        }
    }
}
