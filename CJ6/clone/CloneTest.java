import com.clone.*;


public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee origin = new Employee("John Q", 5000);
            origin.setHireDay(2000, 1, 1);
            Employee copy = origin.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2001, 2, 2);
            System.out.println("origin=" + origin);
            System.out.println("copy=" + copy);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}