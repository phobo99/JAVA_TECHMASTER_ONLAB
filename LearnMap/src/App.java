import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> number = new HashMap<>();
        number.put("One", 1);
        number.put("Two", 2);
        number.put("Six", 6);
        System.out.println(number);

        System.out.println("Key: " + number.keySet());

        System.out.println("value: " + number.values());

        System.out.println("Entry: " + number.entrySet());

        number.remove("One");
        System.out.println(number);

        Map<String, Integer> otherNumber = new HashMap<>(number);
        otherNumber.put("Three", 3);
        System.out.println(otherNumber);

        Map<String, Integer> number2 = new HashMap<>();
        number2.putAll(otherNumber);
        System.out.println(number2);

        System.out.println(number2.get("Two"));
        number2.replace("Two", 2, 5);
        System.out.println(number2);

        number2.replace("Three", 9);
        System.out.println(number2);

        number2.replaceAll((key, oldValue) -> oldValue + 1);
        System.out.println(number2);
    }
}
