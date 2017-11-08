


public class Welcome {
    public static void main(String[] args) {
        String[] greeting = new String[3];
        greeting[0] = "Welcome to Core java";
        greeting[1] = "by Roy Wu";
        greeting[2] = "and someone others";

        for (String g : greeting)
            System.out.println(g);
    }
}