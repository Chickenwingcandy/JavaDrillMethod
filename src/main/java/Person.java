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



}
