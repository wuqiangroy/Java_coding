import java.util.*;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl", 80000, 1993, 12, 1);
        staff[1] = new Employee("Roy", 10000, 1993, 8, 10);
        staff[2] = new Employee("Mark", 11000, 1993, 11, 7);

        for (Employee e: staff) {
            e.raiseSalary(5);
        }

        for (Employee e: staff) {
            System.out.println("name: "+e.getName()+", salary: "+e.getSalary()+
                ", hireDay: "+e.getHireDay());
        }
    }
}


// define a class self
class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        // why month-1? 
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}


