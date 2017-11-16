package interfaces;

import java.util.*;


public class EmployeeSortTest {
    public static void main(String[] args) {
        // List<Employee> staff = new ArrayList<Employee>();
        // staff.add(new Employee("Roy", 10000));
        // staff.add(new Employee("Mark", 12000));
        // staff.add(new Employee("Jhon", 10000));
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Roy", 10000);
        staff[1] = new Employee("Mark", 11000);
        staff[2] = new Employee("Jhon", 10000);

        Arrays.sort(staff);

        for (Employee e: staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }
}
