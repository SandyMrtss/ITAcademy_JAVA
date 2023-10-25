package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names;
        names = Arrays.asList("Ana", "Laura", "Anabel", "Antonio", "Ari", "Sandy", "Pepe", "Juan", "Pol", "ana",
                "ari");

        List<String> wordsWithAAndThree = new ArrayList<>();
        names.stream()
                .filter(s -> (s.startsWith("A")
                        && s.length() == 3))
                .forEach(wordsWithAAndThree::add);

        for (String s : wordsWithAAndThree) {
            System.out.println(s);
        }
    }
}
