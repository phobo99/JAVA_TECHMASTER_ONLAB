import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_ {
    public static void main(String[] args) {
        LinkedList<String> array = new LinkedList<String>();
        array.add("BMW");
        array.add("FORD");
        array.add("BMW");

        Iterator <String> itr = array.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
