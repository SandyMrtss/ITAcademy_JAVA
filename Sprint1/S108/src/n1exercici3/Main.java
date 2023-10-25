package n1exercici3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> months;
        months = Arrays.asList("january", "february", "march", "april", "may","june",
                "july", "august", "september", "october", "november", "december");

        months
                .forEach(s -> System.out.println(s));
    }
}
