import java.util.ArrayList;

public class Person {

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    ArrayList<Person> souls = new ArrayList<Person>(4);

    public String toString() {
        return getName() + " " + getAge();
    }

    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String manageName(String name) {

        this.name = name;

        String newName = getName();
        System.out.println(getName());

        return newName;
    }

    public String createAPerson(String name, int age) {

        String person;

        person = name + age;

        return person;
    }


    public String validateNameLength(String name) {

        if (name.length() > 5) {
            return "Your name is too long, I will call you Jeff.";
        } else {
            return name;
        }
    }

    public String validateCapitalization(String name) {

        if (name.equals(name.toLowerCase())) {
            System.out.println(name);

            String firstLetter = name.substring(0, 1).toUpperCase();
            String restOfName = name.substring(1);
            String capFirstName = firstLetter + restOfName;


            return "Someone didn't care enough about you to type your name correctly. Sorry." + capFirstName;
        } else {

            return name;
        }
    }

    public int[] showAge(ArrayList<Person> souls) {

        int expected[] = new int[4];

        for (int i = 0; i < souls.size(); i++) {

            expected[i] = souls.get(i).getAge();

            System.out.println(expected[i]);

        }

        return expected;
    }

    public boolean hasAName (Person nameExists){
        if (nameExists.getName().equals(null)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isNamed (Person nameExists){
        if(nameExists.getName().equals("null")){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean namedWhat (Person nameExists){
        if(nameExists.getName().equals("null")){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean completedMyMethodDrills(){
        return true;
    }
}
