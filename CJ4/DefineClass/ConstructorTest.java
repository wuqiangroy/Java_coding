import java.util.*;


public class ConstructorTest {
    public static void main(String[] args) {
        Employee4[] staff = new Employee4[3];
        staff[0] = new Employee4("Harry", 4000);
        staff[1] = new Employee4(6000);
        staff[2] = new Employee4();
        
        for (Employee4 e: staff) {
            System.out.println("name: "+e.getName()+" id: "+e.getId()+" salary: "+e.getSalary());
        }
    }
    
}


class Employee4 {
    private static int nextId;

    private int id;
    private String name = ""; // instance field initialization
    private double salary;

    static {    
        Random generator = new Random();
        nextId = generator.nextInt(1000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee4(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee4(double s) {
        this("Employee4 #" + nextId, s);
    }

    public Employee4() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Employee4 Harry = new Employee4("Harry", 41000);
        System.out.println("name: "+Harry.getName()+" id: "+Harry.getId()+" salary: "+Harry.getSalary());
    }
}