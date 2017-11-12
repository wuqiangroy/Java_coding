import java.util.*;
import java.lang.Math;


public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        // define a array which length is n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // define a array which length is k
        int[] resutl = new int[k];
        for (int i = 0; i < resutl.length; i++) {
            // make a random index between 0 and n-1
            int r = (int) (Math.random()*n);
            resutl[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }
        Arrays.sort(resutl);
        System.out.println("Bet the following combination.It'll make you rich!");
        for (int r: resutl) {
            System.out.println(r);
        }
    }
}