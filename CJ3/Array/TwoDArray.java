import java.util.Arrays;


public class TwoDArray {
    public static void main(String[] args) {
        // define a 2d array
        // double[][] balances;
        // balances = new double[NYEARS][NRATES];
        int[][] magicSquare = {
            {16, 3, 2, 13},
            {15, 2, 3, 11},
            {10, 22, 1, 99},
            {34, 12, 33, 11}             
        };
        // how to get a elements from a 2d array
        // use magicSquare[i][j]
        int a = magicSquare[0][0];
        System.out.println(a);
        System.out.println(Arrays.deepToString(magicSquare));
    }
}