/*
eight data-structures in Java
1. int
    1) int      4bytes     -2 147 483 648 ~ 2 147 483 647
    2) short    2bytes     -32 768 ~ 32767
    3) long     8bytes     -9 223 372 036 854 775 808 ~ 9 223 372 036 854 775 807
    4) byte     1byte      -128 ~ 127

2. float
    1) float    4bytes      +- 3.402 823 47E + 38F 
    2) double   8bytes      +- 1.797 693 134 862 315 70E + 308

    what'a about NaN
    NaN is not a direct number, it's means a status, as 0/0 Sqrt(-1)

3. char
    Do not recommand

4. boolean
    false and true
    can not conv boolean and int
*/

import java.lang.Math;

public class DataStructure {
    public static void main(String[] args) {
        int a = 44;
        short b = 2227;
        long c = 2239938382223333L; // remenber how to define
        byte d = 1;
        float e = 1.221f; // remenber how to define
        double f = 1.4444d;  // remenber how to define
        boolean g = true;
        char letter = 'A';

        // variable
        int vacationDay;
        vacationDay = 12;
        double salay = 3600.112;

        // const, use final to declear const
        final double CM_PER_INCH = 2.555;   // only one time to give CM_PER_INCH a value, can not give a value again
        // CM_PER_INCH = 11123; it's wrong!

        System.out.println(c);
        System.out.println(salay);
        System.out.println(vacationDay);
        System.out.println(USUAL_CONST+CM_PER_INCH);

        // operation

        System.out.println(5/2); // 2
        System.out.println(5/2.3); // 2.173913043478261
        // n++ and ++n
        int n = 7;
        int m = 7;
        int h = 2 * n++; // h = 14, n=8
        int i = 2 * ++m; // i = 16, m=8
        System.out.println(h);
        System.out.println(i);

        // logic operation
        // && == and, || == or

        // ternary expression
        // condition ? exp1 : exp2; if condition is true, exp1, else exp2
        System.out.println(a < b ? a : b);

        double x = Math.sqrt(a); 
        double y = Math.pow(a, 2); // pow receive two double params, return a double value

        System.out.println(x);
        System.out.println(y);
    }
    // class constants, able to use this const in many func in a class
    public static final double USUAL_CONST = 3.555;
}
