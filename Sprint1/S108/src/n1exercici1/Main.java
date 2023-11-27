package n1exercici1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<String> words;
        words = Arrays.asList("hola","Or", "my", "name", "is", "Sandy", "and", "some", "words", "are", "longer",
                "than", "others", "are", "shorter", "or", "so", "they", "say");

        List<String> wordsWithO = new ArrayList<>();
        words.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .forEach(wordsWithO::add);

        wordsWithO.forEach(System.out::println);
    }
}
