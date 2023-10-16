package n1exercici2;

public class Main {
    public static void main(String[] args) {
        Person Sandy = new Person("Sandy", "Martos", 23);
        String sentence = "Hello World!";
        int number = 50;

        GenericMethods.printArguments(Sandy, sentence, number);
        GenericMethods.printArguments(sentence, number, Sandy);
        GenericMethods.printArguments(number, Sandy, sentence);

    }
}
