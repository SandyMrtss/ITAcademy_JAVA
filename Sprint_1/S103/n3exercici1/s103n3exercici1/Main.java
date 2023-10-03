package s103n3exercici1;
import S102n2exercici1.Entrada;
import java.io.*;
import java.util.*;

public class Main {

    static class compareByName implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.compareToByName(p2);

        }
    }
    static class compareBySurname implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.compareToBySurname(p2);

        }
    }

    static class compareById implements Comparator<Person>{
        @Override
        public int compare(Person p1, Person p2){
            return p1.compareToById(p2);
        }
    }

    static Set<Person> readData(){
        try {
            File data = new File("Sprint_1/S103/n3exercici1/s103n3exercici1/data.csv");
            Scanner myReader = new Scanner(data);
            Set<Person> dataSet = new HashSet<Person>();
            String header = myReader.nextLine();
            String[] headerSep = header.split(",");
            int name = 3, surname = 3, id = 3;
            for (int i = 0; i < headerSep.length; i++){
                if(headerSep[i].equals("name")){
                    name = i;
                } else if (headerSep[i].equals("surname")) {
                    surname = i;
                }
                else {
                    id = i;
                }
            }
            while (myReader.hasNextLine()){
                String line = myReader.nextLine();
                String[] lineSep = line.split(",");
                Person person = new Person(lineSep[name],lineSep[surname],lineSep[id]);
                dataSet.add(person);
            }
            return dataSet;
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found, check Path");
            return null;
        }
        catch (ArrayIndexOutOfBoundsException ignored){
            return null;
        }
    }

    static int menuOption(){
        System.out.println("Què vols fer?\n" +
                "1.- Introduir persona.\n" +
                "2.- Mostrar les persones ordenades per nom (A-Z).\n" +
                "3.- Mostrar les persones ordenades per nom (Z-A).\n" +
                "4.- Mostrar les persones ordenades per cognoms (A-Z).\n" +
                "5.- Mostrar les persones ordenades per cognoms (Z-A).\n" +
                "6.- Mostrar les persones ordenades per DNI (1-9).\n" +
                "7.- Mostrar les persones ordenades per DNI (9-1).\n" +
                "0.- Sortir.");
        int option =  Entrada.llegirInt("Opció escollida: ");
        return option;
    }

    static Person createPerson(){
        Scanner in = new Scanner(System.in);
        String name, surname, id;
        name = Entrada.llegirString("Introdueix nom: ");
        surname = Entrada.llegirString("Introdueix cognom: ");
        id = Entrada.llegirString("Introdueix DNI: ");
        return new Person(name, surname, id);
    }

    static void showOrderedSet(SortedSet<Person> orderedSet){
        System.out.println("___Nom___ ____Cognoms___ __NIF__ ");
        for (Person person : orderedSet) {
            System.out.printf("%s %s %s\n", person.getName(), person.getSurname(), person.getId());
        }
    }

    static SortedSet<Person> orderSet(Set<Person> unorderedSet, SortedSet<Person> orderedSet){
        for (Person person : unorderedSet){
            orderedSet.add(person);
        }
        return orderedSet;
    }


    public static void main(String[] args){
        Set<Person> dataSet = readData();
        SortedSet<Person> orderedSet;
        int option;
        do {
            option = menuOption();
            switch (option){
                case 1:
                    dataSet.add(createPerson());
                    System.out.println("Persona afegida");
                    break;
                case 2:
                    orderedSet = orderSet(dataSet, new TreeSet<>(new compareByName()));
                    showOrderedSet(orderedSet);
                    break;
                case 3:
                    orderedSet = orderSet(dataSet, new TreeSet<>(new compareByName().reversed()));
                    showOrderedSet(orderedSet);
                    break;
                case 4:
                    orderedSet = orderSet(dataSet, new TreeSet<>(new compareBySurname()));
                    showOrderedSet(orderedSet);
                    break;
                case 5:
                    orderedSet = orderSet(dataSet, new TreeSet<>(new compareBySurname().reversed()));
                    showOrderedSet(orderedSet);
                    break;
                case 6:
                    orderedSet = orderSet(dataSet, new TreeSet<>(new compareById()));
                    showOrderedSet(orderedSet);
                    break;
                case 7:
                    orderedSet = orderSet(dataSet, new TreeSet<>(new compareById().reversed()));
                    showOrderedSet(orderedSet);
                    break;
                default:
                    option = 0;
                    System.out.println("Programa finalitzat");
                    break;
            }
        }
        while (option != 0);

    }
}
