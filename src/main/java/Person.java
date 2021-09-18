import java.util.Locale;

public class Person {

    private String name;

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
            return "Someone didn’t care enough about you to type your name correctly. Sorry.";
        }
        else {
            return name;
        }
    }

    
}
