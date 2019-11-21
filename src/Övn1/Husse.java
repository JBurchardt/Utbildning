package Övn1;

import java.util.List;

public class Husse {

    private String name;
    private List<Hund> dogList;

    /*To be able to create a master with only a name*/
    public Husse(String name){
        this.name = name;
    }

    /*Creating a master with a name and assigning a list of dogs*/
    public Husse(String name, List<Hund> dogList){

        this.name = name;
        this.dogList = dogList;
    }

    /*Returning the name of the master*/
    public String getName(){
        return name;
    }

    /*Returning list of dogs the master owns*/
    public List<Hund> getList(){
        return dogList;
    }

    /*Lets the master introduce himself and which dogs he owns*/
    public void about(){
        System.out.println("Hello! My name is " + this.getName()
                + " and I own the following dogs: ");

        /*Looping through and printing all dogs in the list*/
        for (int i = 0; i < this.getList().size(); i++)
        System.out.println("-" + this.getList().get(i).getName());
    }
}
