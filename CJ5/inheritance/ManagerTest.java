import com.*;


public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Roy", 130000, 2007, 8, 3);
        boss.setBonus(300000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Mark", 12000, 2016, 12, 1);
        staff[2] = new Employee("Jhon", 13000, 2017, 1, 1);

        for (Employee e: staff) {
            System.out.println("name: "+e.getName()+", salary: "+e.getSalary());
        }
    }
}