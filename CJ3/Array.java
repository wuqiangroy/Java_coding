import java.util.Arrays;


public class Array {
    public static void main(String[] args) {
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }
        // print this array
        System.out.println(Arrays.toString(a));

        // how to define a array / slice
        int[] smallPrimes = {2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(smallPrimes));
        smallPrimes = new int[] {11, 13, 23, 29, 31};
        System.out.println(Arrays.toString(smallPrimes));

        // array copy, like python, referer from same array
        int[] newPrimes = smallPrimes;
        newPrimes[1] = 15; // 13 -> 15
        System.out.println(Arrays.toString(newPrimes));
        System.out.println(Arrays.toString(newPrimes));

        // Arrays.copy
        // smallPrimes: [11, 15, 23, 29, 31]
        int[] copyPrimes = Arrays.copyOf(smallPrimes, smallPrimes.length);
        copyPrimes[1] = 16;
        // [11, 16, 23, 29, 31]
        System.out.println(Arrays.toString(copyPrimes));
        // [11, 15, 23, 29, 31]
        System.out.println(Arrays.toString(smallPrimes));

        // add length through Arrays.copyOf, excess value is 0
        int[] newLength = Arrays.copyOf(smallPrimes, 2*smallPrimes.length);
        System.out.printf("newLength is %s, and it's length is %d", Arrays.toString(newLength), newLength.length);
    }
}