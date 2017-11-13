

public class StaticTest {
    public static void main(String[] args) {
        Employee2[] staff = new Employee2[3];
        staff[0] = new Employee2("Roy", 10000);
        staff[1] = new Employee2("Mark", 12000);
        staff[2] = new Employee2("Carl", 20000);

        for (Employee2 e: staff) {
            e.setId();
            System.out.println("name: " + e.getName() + ", id: " + e.getId() + ", salary: " + e.getSalary());
        }

        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);
    }
}


class Employee2 {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee2(String n, double s) {
        name = n;
        salary = s;
        id = 0;
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

    public void setId() {
        id = nextId;
        nextId ++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Employee2 e = new Employee2("Harry", 5000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}