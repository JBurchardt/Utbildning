package Övn1;

public class Matte{

    private String name;
    private Katt cat;

    /*To be able to create a mistress with only a name*/
    public Matte(String name){
        this.name = name;
    }

    /*Creating a mistress with a name and assigning a cat*/
    public Matte(String name, Katt cat){

        this.name = name;
        this.cat = cat;
        cat.setMatte(this); /*Letting the cat know it now has a mistress*/
    }

    /*Returning the name of the mistress*/
    public String getName(){
        return name;
    }

    /*Returning the cat of the mistress*/
    public Katt getCat(){
        return cat;
    }
}
