package n1exercici2;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<String> words;
        words = Arrays.asList("hola", "my", "name", "is", "Sandy", "and", "some", "words", "are", "longer",
                "than", "others", "are", "shorter", "or", "so", "they", "say");

        List<String> wordsWithOAndLong = new ArrayList<>();
        words.stream()
                .filter(s -> (s.toLowerCase().contains("o")
                        && s.length() > 5))
                .forEach(s -> wordsWithOAndLong.add(s));

        wordsWithOAndLong.forEach(System.out::println);
    }
}
