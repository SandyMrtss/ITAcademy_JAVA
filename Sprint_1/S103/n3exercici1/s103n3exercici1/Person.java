package s103n3exercici1;

public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private String id;


    public Person(String name, String surname, String id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getId(){
        return this.id;
    }

    @Override
    public int compareTo(Person p1){
        return this.id.compareToIgnoreCase(p1.id);
    }

    public int compareToByName(Person p1) {
        return this.name.compareToIgnoreCase(p1.name);
    }

    public int compareToBySurname(Person p1){
        return this.surname.compareToIgnoreCase(p1.surname);
    }
    public int compareToById(Person p1){
        int comparador = 0;
        for (int i = 0; i < this.id.length(); i++) {
            int myNum = this.id.charAt(i);
            int p1Num = p1.id.charAt(i);
            comparador = myNum - p1Num;
            if (comparador != 0){
                return comparador;
            }
        }
        return comparador;
    }
}
