package n2exercici2;

import n1exercici2.Person;
import n2exercici1.GenericMethodsModified;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person Sandy = new Person("Sandy", "Martos", 23);
        Person Javi1 = new Person("Javi", "Martín", 23);
        Person Javi2 = new Person("Javi", "Márquez", 240);


        ArrayList<Person> firstList = new ArrayList<>();
        firstList.add(Sandy);
        firstList.add(Javi1);
        firstList.add(Javi2);

        ArrayList<Integer> secondList = new ArrayList<>();
        for (int i = 0; i <= 5; i++){
            secondList.add(i);
        }

        GenericMethodsModifiedAgain.printArguments(firstList);
        GenericMethodsModifiedAgain.printArguments(secondList);

    }
}
