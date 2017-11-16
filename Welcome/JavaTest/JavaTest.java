import java.lang.Integer;
import java.lang.String;
import java.lang.Double;
import java.util.*;
import java.lang.reflect.*;


public class JavaTest {
    public static void main(String[] args) {
        Integer a = 1000; // integer obj
        Integer b = 1000; // integer obj
        String c = "1000";

        int d = 1000;
        int f = 1000;

        // == means two obj refers same location in memery
        System.out.println(a == b); // false
        // two int value are same
        System.out.println(d == f); // true

        System.out.println(a.equals(b)); // true

        // string -> int
        System.out.println(Integer.parseInt(c));

        double n = Double.MIN_VALUE;
        System.out.println(n);

    }
}