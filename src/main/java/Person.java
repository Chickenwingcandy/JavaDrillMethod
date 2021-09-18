public class Person {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String printName(){
        System.out.println(getName());
        return name;
    }

}
