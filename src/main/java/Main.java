import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        Person tim = new Person("Tim", 42);
        Person mike = new Person ("Mike", 63);
        Person jan = new Person ("Jan", 52);
        Person susan = new Person ("Susan", 25);


        System.out.println(tim);

        ArrayList<Person> people = new ArrayList<Person>(4);

        people.add(tim);
        people.add(mike);
        people.add(jan);
        people.add(susan);

        System.out.println(people);

        person.showAge(people);



    }
}
