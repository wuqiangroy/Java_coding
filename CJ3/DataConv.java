
import java.lang.Math;

import javafx.geometry.Side;


public class DataConv {
    public static void main(String[] args) {       
        int n = 1234567890;
        float f = n;
        double x = 5.559d;
        int y = (int) x;
        int z = (int) Math.round(x);
        long zl = Math.round(x);
        System.out.println(f);
        System.out.println(y); // 5
        System.out.println(z); // 6
        System.out.println(zl); // 6
    }
}