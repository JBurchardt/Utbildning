package Övn1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

/* 1 */ System.out.println("(1)");

        /*Creating dogs and giving them a name and breed*/
        Hund hund1 = new Hund("Janne","Bulldog");
        System.out.println("A dog was created with the name "
                + hund1.getName() + " and the breed " + hund1.getBreed());

        Hund hund2 = new Hund("Nuuskamuikkunen","Finnish Lapphund");
        System.out.println("A dog was created with the name "
                + hund2.getName() + " and the breed " + hund2.getBreed());

        /*Creating cats and giving them a name and breed*/
        Katt katt1 = new Katt("Lars-Göran","Bonnkatt");
        System.out.println("A cat was created with the name "
                + katt1.getName() + " and the breed " + katt1.getBreed());

        Katt katt2 = new Katt("Anna-Greta","Maine Coon");
        System.out.println("A cat was created with the name "
                + katt2.getName() + " and the breed " + katt2.getBreed());

/* 2 */ System.out.println("\n(2)");

        /*Creating mistresses and giving them a name and a cat*/
        Matte matte1 = new Matte("Olga", katt1);
        System.out.println("A mistress was created with the name "
                + matte1.getName() + ", who owns the cat " + matte1.getCat().getName());

        Matte matte2 = new Matte("Petra", katt2);
        System.out.println("A mistress was created with the name "
                + matte2.getName() + ", who owns the cat " + matte2.getCat().getName());

/* 3 */ System.out.println("\n(3)");

        /*Creating a list for which dogs "husse1" will own*/
        List<Hund> husse1DogList = new ArrayList<>();

        /*Adding two dogs to that list*/
        husse1DogList.add(hund1);
        husse1DogList.add(hund2);

        /*Creating a master and giving him a name and a list of dogs (2)*/
        Husse husse1 = new Husse("Karl", husse1DogList);

        /*Calling method about() to let husse1 introduce himself*/
        husse1.about();

/* 4 */ System.out.println("\n(4)");

        /*"Asking" the cats which owners they have*/
        System.out.printf("%s, who is your owner?%nMy owner is %s%n",
                katt1.getName() ,katt1.getMistress().getName());

        System.out.printf("%s, who is your owner?%nMy owner is %s%n",
                katt2.getName() ,katt2.getMistress().getName());
    }
}
