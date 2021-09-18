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

    
}
