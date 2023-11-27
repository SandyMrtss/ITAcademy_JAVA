package n2exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("hola", "my", "name", "is", "Sandy", "and", "some", "words", "are", "longer",
                "than", 1, 12, 21, 2221, 9286, 12, 141);

        List<String> stringList = new ArrayList<>();
        list
                .forEach(s-> stringList.add(s.toString().toLowerCase()));

        List<String> sortedList = new ArrayList<>(stringList);
        System.out.println("Ordenats pel primer caràcter:");
        sortedList.stream()
                .sorted(Comparator.comparingInt(o -> ((int) (o.charAt(0)))))
                .forEach(System.out::println);

        List<String> sortedEList = new ArrayList<>();
        stringList.stream()
                .filter(s-> s.contains("e"))
                .forEach(sortedEList::add);
        stringList.stream()
                .filter(s-> !s.contains("e"))
                .forEach(sortedEList::add);
        System.out.println("Paraules amb 'e' primer");
        sortedEList
                .forEach(System.out::println);

        List<String> modifiedList = new ArrayList<>();
        stringList.stream()
                .map(s->{
                    if (s.contains("a")){
                        s = s.replaceAll("a", "4");
                    }
                    return s;
                })
                .forEach(modifiedList::add);

        System.out.println("Lletra 'a' substituida per '4':");
        modifiedList
                .forEach(System.out::println);

        List<String> numericList = new ArrayList<>();
        stringList.stream()
                .filter(s -> {
                    char[] chars = s.toCharArray();
                    for(Character c: chars){
                        if(!Character.isDigit(c)){
                            return false;
                        }
                    }
                    return true;
                })
                .forEach(numericList::add);
        System.out.println("Només numèrics");
        numericList
                .forEach(System.out::println);

    }
}
