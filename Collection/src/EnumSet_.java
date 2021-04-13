import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSet_ {
    enum days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.MONDAY , days.TUESDAY);

        Iterator<days> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
