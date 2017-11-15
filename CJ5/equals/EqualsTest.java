import com.equals.*;


public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice 1", 10000, 2001, 12, 1);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice 3", 20000, 2004, 2, 1);
        Employee bob = new Employee("Bob", 10000, 2010, 3, 1);

        System.out.println("alice1 == alice2" + (alice1 == alice2));

        System.out.println("alice1 == alice 3" + (alice1 == alice3));

        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));

        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        Manager car = new Manager("car", 100000, 2009, 10, 1);
        Manager boss = new Manager("boss", 1000000, 1993, 12, 3);

        boss.setBonus(50000);

        System.out.println("boss.toString(): " + boss);
        System.out.println("car.equals(boss)" + car.equals(boss));
        System.out.println("alice1.hashCode()" + alice1.hashCode());
        System.out.println("alice3.hashCode()" + alice3.hashCode());
        System.out.println("bob.hashCode()" + bob.hashCode());
        System.out.println("car.hashCode()" + car.hashCode());

    }
}