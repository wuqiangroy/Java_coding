

public class Reflect {
    public static void main(String[] args) {
        try {
            Class cl = Class.forName("java.util.Date");
            System.out.println(cl.getDeclaredFields());
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}