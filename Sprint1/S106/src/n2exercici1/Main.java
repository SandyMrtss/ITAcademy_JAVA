package n2exercici1;

import n1exercici2.Person;

public class Main {
    public static void main(String[] args) {
        Person Sandy = new Person("Sandy", "Martos", 23);
        String sentence = "Hello World!";
        int number = 50;

        GenericMethodsModified.printArguments(Sandy, sentence, number);

    }
}
