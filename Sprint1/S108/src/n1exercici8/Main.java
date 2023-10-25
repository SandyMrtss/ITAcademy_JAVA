package n1exercici8;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        StringFunctional f = str -> {
            StringBuilder stringBuilder = new StringBuilder();
            Stream.iterate(str.length() - 1, i -> i >= 0, i -> --i )
                    .forEach(i -> stringBuilder.append(str.charAt(i)));
            return stringBuilder.toString();
        };
        String S = f.reverse("My name is Sandy and I'm tired");

        System.out.println(S);

    }
}
