import com.horstmann.corejava.*;

import static java.lang.System.*;


public class PackageTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Roy", 10000, 2008, 11, 10);
        staff[1] = new Employee("Mark", 12000, 1009, 2, 1);
        staff[2] = new Employee("Jhon", 14000, 1007, 3, 7);

        for (Employee e: staff) {
            e.raiseSalary(10);
            out.println("name: "+e.getName()+", salary: "+e.getSalary()+", date: "+e.getHireDay());
        }
    }
}