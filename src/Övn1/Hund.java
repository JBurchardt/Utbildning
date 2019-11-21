package Övn1;

public class Hund {

    private String name;
    private String breed;

    /*When creating a dog, it must have a name and breed*/
    public Hund(String name, String breed){

        this.name = name;
        this.breed = breed;
    }

    /*Returning the name of the dog*/
    public String getName(){
        return name;
    }

    /*Returning the breed of the dog*/
    public String getBreed(){
        return breed;
    }
}
