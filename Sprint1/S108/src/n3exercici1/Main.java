package n3exercici1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Maria", 20, "JAVA", 8.75);
        Student student2 = new Student("Juan", 17, "PHP", 4.3);
        Student student3 = new Student("Ana", 23, "PHP", 5.0);
        Student student4 = new Student("Antonio", 21, "JAVA", 7.4);
        Student student5 = new Student("Pepe", 30, "ANGULAR", 6.25);
        Student student6 = new Student("Laura", 24, "FONAMENTS", 9.1);
        Student student7 = new Student("Marta", 27, "ANGULAR", 2.7);
        Student student8 = new Student("Jose", 22, "JAVA", 7.35);
        Student student9 = new Student("Pedro", 18, "PHP", 5.7);
        Student student10 = new Student("Pedro", 40, "JAVA", 6.9);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10);
        students
                .forEach(s -> System.out.printf("Nom: %s Edat:%d\n", s.getName(),s.getAge()));

        List<Student> studentsWithA = new ArrayList<>();
        students.stream()
                .filter(s-> s.getName().toLowerCase().charAt(0) == 'a')
                .forEach(studentsWithA::add);
        System.out.println("\nAlumnes que comencen per 'a':");
        studentsWithA.
                forEach(System.out::println);

        System.out.println("\nAlumnes aprobats:");
        students.stream()
                .filter(s-> s.getMark() >= 5.0)
                .forEach(System.out::println);

        System.out.println("\nAlumnes aprobats que no fan PHP:");
        students.stream()
                .filter(s-> s.getMark() >= 5.0
                && !s.getCourse().equalsIgnoreCase("PHP:"))
                .forEach(System.out::println);

        System.out.println("\nAlumnes de JAVA majors d'edat:");
        students.stream()
                .filter(s-> s.getAge() >= 18
                && s.getCourse().equalsIgnoreCase("JAVA"))
                .forEach(System.out::println);
    }
}
