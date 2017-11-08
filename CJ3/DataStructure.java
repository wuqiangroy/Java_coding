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
    NaN is not a direct number, it's means a status, as 0/0 Squr(-1)

3. char
    Do not recommand

4. boolean
    false and true
    can not conv boolean and int
*/

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
        System.out.println(c);
        System.out.println(g);
    }
}
