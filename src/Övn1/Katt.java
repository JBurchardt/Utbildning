package Övn1;

public class Katt {

    private String name;
    private String breed;
    private Matte matte;

    /*When creating a cat, it must have a name and breed*/
    public Katt(String name, String breed){

        this.name = name;
        this.breed = breed;

    }

    /*Returning the name of the cat*/
    public String getName(){
        return name;
    }

    /*Returning the breed of the cat*/
    public String getBreed(){
        return breed;
    }

    /*Method used in class "Matte" to let the cat know it has a mistress*/
    public void setMatte(Matte matte){
        this.matte = matte;
    }

    /*Returning which mistress the cat has*/
    public Matte getMistress(){
        return matte;
    }
}
