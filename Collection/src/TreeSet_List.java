import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_List {
    public static void main(String[] args) {
        TreeSet <String> array = new TreeSet<String>();     // sap xep theo thu tu tang dan
        array.add("BMW");
        array.add("Mazda");
        array.add("FORD");
        array.add("BMW");

        Iterator<String> itr = array.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
