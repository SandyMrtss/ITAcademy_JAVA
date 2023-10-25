package n1exercici7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("hola", "my", "name", "is", "Sandy", "and", "some", "words", "are", "longer",
                "than", 1, 11, 111, 1111, 1111, 11111, 111111);

        List<String> sortedList = new ArrayList<>();
        list.stream()
                .filter(o -> o instanceof String)
                .forEach( o -> sortedList.add((String) o));

        sortedList.sort(Comparator.comparing(String::length).reversed());
        for(String s : sortedList) {
            System.out.println(s);
        }
    }
}
