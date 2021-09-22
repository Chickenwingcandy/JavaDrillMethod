import java.util.Locale;

public class Person {

    private String name;

    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){

        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public String manageName(String name){

        this.name = name;

        String newName = getName();
        System.out.println(getName());

        return newName;
    }

    public String createAPerson(String name, int age){

        String person;

        person = name + age;

        return person;
    }


    public String validateNameLength(String name){

        if (name.length() > 5){
                return "Your name is too long, I will call you Jeff.";
            }
        else{
            return name;
        }
    }

    public String validateCapitalization(String name){

        if(name.equals(name.toLowerCase())){
            System.out.println(name);

            String firstLetter = name.substring(0,1).toUpperCase();
            String restOfName = name.substring(1);
            String capFirstName = firstLetter + restOfName;


            return "Someone didn't care enough about you to type your name correctly. Sorry." + capFirstName;
        }

        else {

            return name;
        }
    }

}
