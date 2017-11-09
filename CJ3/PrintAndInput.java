import java.io.PrintWriter;
import java.util.*;
import java.nio.file.Paths;


public class PrintAndInput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = in.nextLine();
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.println("Hello, "+name+".Next year, you'll be "+(age+1));
        
        // format print
        double x = 1000.0 / 3.4;
        System.out.printf("%8.2f", x);
        System.out.printf("Hello, %s. Next year, you'll be %d", name, age+1);
        System.out.printf("%,.2f", 1000.0/3.0); // 3,333.33 

        String message = String.format("This is a float number %f", 1000.0/3.0);
        System.out.println(message);

        // format date
        System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due data: ", new Date());
        // Due data:  November 9, 2017

        // input file and output
        // Scanner inFile = new Scanner(Paths.get("DataString.java"));
        // out
        // PrintWriter outFile = new PrintWriter("output.txt");
    }
}