package n1exercici7;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("hola", "my", "name", "is", "Sandy", "and", "some", "words", "are", "longer",
                "than", 1, 11, 111, 1111, 1111, 11111, 111111);

        List<String> sortedList = new ArrayList<>();
        list.stream()
                .filter(o -> o instanceof String)
                .map(Object::toString)
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(sortedList::add);

        sortedList.forEach(System.out::println);
    }
}
