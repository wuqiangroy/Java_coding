

public class DataString {
    public static void main(String[] args) {
        // string
        String e = ""; // empty string
        String greeting = "Hello";
        String s = greeting.substring(0, 5);
        System.out.println(e);
        System.out.println(greeting);
        System.out.println(s);

        // stitching

        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + " " + PG13;
        System.out.println(message);
        int age = 13;
        String rating = "PG" + age; // int age conver to string automatical
        System.out.println(rating);
        System.out.println("my age is " + age);

        // modify string
        // string - can not modify string
        String hello = "Hello";
        hello = hello.substring(0, 3) + "p!";
        System.out.println(hello);

        // judgment if two strings equal
        System.out.println("help!".equals(hello)); // false
        System.out.println("help!".equalsIgnoreCase(hello)); // true

        // can not use == to judge if they are equal
        // == means two obj are in the same memerry location
        System.out.println("Help!" == hello); 
        String world = "world";
        System.out.println(world=="world"); // true because JVM share same location to same string
        System.out.println("wor"==world.substring(0, 3)); // false + and substring do not share

        // length
        String greet = "Hello";
        int length = greet.length(); // is 5
        System.out.println(length);

        // code piont count 
        int cp = greet.codePointCount(0, greet.length());
        System.out.println(cp);

        // string builder
        StringBuilder builder = new StringBuilder();
        builder.append("name");
        builder.append("dream");
        String completeString = builder.toString();
        System.out.println(completeString);
    }
}