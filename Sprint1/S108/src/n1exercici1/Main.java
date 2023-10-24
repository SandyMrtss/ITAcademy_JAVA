package n1exercici1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("my");
        words.add("name");
        words.add("is");
        words.add("Sandy");
        words.add("and");
        words.add("some");
        words.add("words");
        words.add("are");
        words.add("longer");
        words.add("than");
        words.add("others");
        words.add("those");
        words.add("are");
        words.add("shorter");
        words.add("or");
        words.add("so");
        words.add("my");
        words.add("my");

        List<String> wordsWithO = new ArrayList<>();
        words.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .forEach(s -> wordsWithO.add(s));

        for(String s : wordsWithO){
        System.out.println(s);
        }
    }

}
