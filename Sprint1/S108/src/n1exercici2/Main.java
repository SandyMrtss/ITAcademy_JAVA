package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        for(String s : wordsWithOAndLong) {
            System.out.println(s);
        }
    }
}
