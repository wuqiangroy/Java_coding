import com.abstractClass.*;


public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Roy", 14000, 2017, 4, 3);
        people[1] = new Student("WenWen", "economic");

        for (Person p: people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}