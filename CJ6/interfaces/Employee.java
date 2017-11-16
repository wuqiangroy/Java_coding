package interfaces;


public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String aName, double aSalary) {
        name = aName;
        salary = aSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

     public int compareTo(Employee other) {
         return Double.compare(salary, other.salary);
    
     }
    public static void main(String[] args) {

        System.out.println("111");
    }
}