package n3exercici1;
import n2exercici1.Entrada;
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
            File data = new File("Sprint1/S103/n3exercici1/s103n3exercici1/data.csv");
            Scanner myReader = new Scanner(data);
            Set<Person> dataSet = new HashSet<>();
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
        return Entrada.llegirInt("Opció escollida: ");
    }

    static Person createPerson(){
        String name, surname, id;
        name = Entrada.llegirString("Introdueix nom: ");
        surname = Entrada.llegirString("Introdueix cognom: ");
        id = Entrada.llegirString("Introdueix DNI: ");
        return new Person(name, surname, id);
    }

    static void showOrderedSet(SortedSet<Person> orderedSet){
        System.out.println("___Nom___ _____Cognoms____ ___NIF___ ");
        for (Person person : orderedSet) {
            System.out.printf("%-9s %-17s %9s\n", person.getName(), person.getSurname(), person.getId());
        }
    }

    public static void main(String[] args){
        Set<Person> dataSet = readData();
        SortedSet<Person> orderedSet;
        int option;
        do {
            option = menuOption();
            switch (option) {
                case 1 -> {
                    dataSet.add(createPerson());
                    System.out.println("Persona afegida");
                }
                case 2 -> {
                    orderedSet = new TreeSet<>(new compareByName());
                    orderedSet.addAll(dataSet);
                    showOrderedSet(orderedSet);
                }
                case 3 -> {
                    orderedSet = new TreeSet<>(new compareByName().reversed());
                    orderedSet.addAll(dataSet);
                    showOrderedSet(orderedSet);
                }
                case 4 -> {
                    orderedSet = new TreeSet<>(new compareBySurname());
                    orderedSet.addAll(dataSet);
                    showOrderedSet(orderedSet);
                }
                case 5 -> {
                    orderedSet = new TreeSet<>(new compareBySurname().reversed());
                    orderedSet.addAll(dataSet);
                    showOrderedSet(orderedSet);
                }
                case 6 -> {
                    orderedSet = new TreeSet<>(new compareById());
                    orderedSet.addAll(dataSet);
                    showOrderedSet(orderedSet);
                }
                case 7 -> {
                    orderedSet = new TreeSet<>(new compareById().reversed());
                    orderedSet.addAll(dataSet);
                    showOrderedSet(orderedSet);
                }
                default -> {
                    option = 0;
                    System.out.println("Programa finalitzat");
                }
            }
        }
        while (option != 0);

    }
}
