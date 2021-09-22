import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Colt");

        person.setAge(42);

        person.getName();

        person.getAge();

        System.out.println( person.getName() + " " + person.getAge());

        String Tim = person.createAPerson("Tim ", 36);
        String PunchLine = person.createAPerson("PunchLine ", 620);
        String Jan = person.createAPerson("Jan ", 27);
        String Susan = person.createAPerson("Susan ", 96);

        System.out.println(Tim);

        ArrayList<String> people = new ArrayList<String>(4);

        people.add(Tim);
        people.add(PunchLine);
        people.add(Jan);
        people.add(Susan);

        
    }
}
