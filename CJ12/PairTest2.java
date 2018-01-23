import java.util.*;

public class PairTest2 {
    public static void main(String[] args) {
        GregorianCalendar[] birthday = {
            new GregorianCalendar(2001, Calendar.DECEMBER, 9),
            new GregorianCalendar(2003, Calendar.JANUARY, 1),
            new GregorianCalendar(2007, Calendar.FEBRUARY, 3)
        };
        Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthday);
        System.out.println("min = " + mm.getFirst().getTime());
        System.out.println("max = " + mm.getSecond().getTime());
    }
}

class ArrayAlg {
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}