import java.util.*;
import com.arrayList.*;


public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Roy", 100000, 2010, 12, 1));
        staff.add(new Employee("Mark", 12000, 2016, 11, 2));
        staff.add(new Employee("Jhon", 14000, 2017, 1, 1));
        System.out.println(staff.size());
        System.out.println(staff.get(0));

        for (Employee e: staff) {
            e.raiseSalary(20);
        }

        for (Employee e: staff) {
            System.out.println("name="+e.getName()+", salary="+e.getSalary());
        }
    }
}