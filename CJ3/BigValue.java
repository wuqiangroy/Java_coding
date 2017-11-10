import java.math.BigInteger;


public class BigValue {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(1000);
        BigInteger b = BigInteger.valueOf(100021);
        // can not use + - / and *
        BigInteger c = a.add(b);
        BigInteger d = c.multiply(b.add(BigInteger.valueOf(2211)));
        System.out.printf("%d, %d, %d, %d", a, b, c, d);
    }
}